package mx.com.balanceneural.services.Service;

import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.repository.PacienteRepository;
import mx.com.balanceneural.services.utilidades.EmailService;
import mx.com.balanceneural.services.utilidades.Template;

@Service
public class PacienteService {
	@Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private EmailService emailService;

    public boolean savePaciente(Paciente paciente){

    	String passDecode = paciente.getUsuario().getPassword();
    	paciente.getUsuario().setPassword(passwordEncoder.encode(paciente.getUsuario().getPassword()));

    	try {
			emailService.sendEmail(paciente.getUsuario().getEmail(), "BALANCENEURAL", new Template()
					.contentTemplate(paciente.getNombre(), paciente.getApellido(), passDecode, paciente.getUsuario().getEmail()));
			pacienteRepository.save(paciente);
		} catch (MessagingException e) {
			e.printStackTrace();
		}


        return pacienteRepository.existsByNombreAndApellido(paciente.getNombre(),paciente.getApellido());
    }

    public List<Paciente> getAllPacientes(){
    	return pacienteRepository.findAll();
    }

    public Paciente getPaciente(Long id){
    	return pacienteRepository.findById(id).get();
    }
    
    public Boolean updatePass(long id, Map<String, Object> informacion) {
		Boolean bandera = false;
		Paciente paciente = pacienteRepository.findById(id).get();
		if(passwordEncoder.matches(informacion.get("actualContrasena").toString(),paciente.getUsuario().getPassword())) {
			paciente.getUsuario().setPassword(passwordEncoder.encode(informacion.get("nuevaContrasena").toString()));
			pacienteRepository.save(paciente);
			bandera= true;
			try {
				emailService.sendEmail(paciente.getUsuario().getEmail(), "BALANCENEURAL", new Template()
						.contentTemplateRecoverPassword(informacion.get("nuevaContrasena").toString(), paciente.getUsuario().getEmail()));
			} catch (MessagingException e) {
				
				e.printStackTrace();
			}
			
		}
		return bandera;
	}
}
