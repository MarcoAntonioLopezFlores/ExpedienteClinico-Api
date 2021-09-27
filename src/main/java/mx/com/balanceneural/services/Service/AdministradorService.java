package mx.com.balanceneural.services.Service;

import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import mx.com.balanceneural.services.entity.Administrador;
import mx.com.balanceneural.services.repository.AdministradorRepository;
import mx.com.balanceneural.services.utilidades.EmailService;
import mx.com.balanceneural.services.utilidades.Template;



@Service
public class AdministradorService {
	@Autowired
    private PasswordEncoder passwordEncoder;
   
	@Autowired
    private EmailService emailService;
	
    @Autowired
    AdministradorRepository administradorRepository;
    
    public boolean saveAdministrador(Administrador administrador) {
        administrador.getUsuario().setPassword(passwordEncoder.encode(administrador.getUsuario().getPassword()));
        administradorRepository.save(administrador);
        return administradorRepository.existsByNombreAndApellido(administrador.getNombre(),administrador.getApellido());
    }
    
    
	public Boolean updatePass(long id, Map<String, Object> informacion) {
		Boolean bandera = false;
		System.out.println(informacion);
		Administrador admin = administradorRepository.findById(id).get();
		if(passwordEncoder.matches(informacion.get("actualContrasena").toString(),admin.getUsuario().getPassword())) {
			
			admin.getUsuario().setPassword(passwordEncoder.encode(informacion.get("nuevaContrasena").toString()));
			administradorRepository.save(admin);
			bandera= true;
			try {
				emailService.sendEmail(admin.getUsuario().getEmail(), "BALANCENEURAL", new Template()
						.contentTemplateRecoverPassword(informacion.get("nuevaContrasena").toString(), admin.getUsuario().getEmail()));
			} catch (MessagingException e) {
				
				e.printStackTrace();
			}
			
		}
		return bandera;
	}
}
