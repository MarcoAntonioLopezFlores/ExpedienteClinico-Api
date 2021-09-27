package mx.com.balanceneural.services.Service;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.Doctor;
import mx.com.balanceneural.services.repository.DoctorRepository;
import mx.com.balanceneural.services.utilidades.EmailService;
import mx.com.balanceneural.services.utilidades.Template;

@Service
public class DoctorService {
	 	@Autowired
	    private PasswordEncoder passwordEncoder;
	    @Autowired
	    private DoctorRepository doctorRepository;
	    @Autowired
	    private EmailService emailService;

	    public boolean saveDoctor(Doctor doctor) {
	        String passDecode= doctor.getUsuario().getPassword();
	    	doctor.getUsuario().setPassword(passwordEncoder.encode(doctor.getUsuario().getPassword()));
	        try {
				emailService.sendEmail(doctor.getUsuario().getEmail(), "BALANCENEURAL", new Template()
						.contentTemplate(doctor.getNombre(), doctor.getApellido(), passDecode, doctor.getUsuario().getEmail()));
				doctorRepository.save(doctor);
			} catch (MessagingException e) {
				
				e.printStackTrace();
			}
	        return doctorRepository.existsByNombreAndApellido(doctor.getNombre(),doctor.getApellido());
	    }

	    public List<Doctor> getDoctores(){
	    	return doctorRepository.findAll();
	    }
	    
	    public boolean deleteDoctor(Long id) {
	    	doctorRepository.deleteById(id);
	    	return !doctorRepository.existsById(id);
	    }
	    
	    public Doctor updateDoctor(Doctor doctor) {
	    		Doctor allDataDoctor = doctorRepository.getOne(doctor.getId());
	    		allDataDoctor.setNombre(doctor.getNombre());
	    		allDataDoctor.setApellido(doctor.getApellido());
	    		allDataDoctor.setEspecialidad(doctor.getEspecialidad());
	    		return doctorRepository.save(allDataDoctor);
	    }
	    
	    public Doctor getDoctor(Long id) {
	    	return doctorRepository.findById(id).get();
	    }
	    
	    public Boolean updatePass(long id, Map<String, Object> informacion) {
			Boolean bandera = false;
			Doctor doctor = doctorRepository.findById(id).get();
			if(passwordEncoder.matches(informacion.get("actualContrasena").toString(),doctor.getUsuario().getPassword())) {
				doctor.getUsuario().setPassword(passwordEncoder.encode(informacion.get("nuevaContrasena").toString()));
				doctorRepository.save(doctor);
				bandera= true;
				try {
					emailService.sendEmail(doctor.getUsuario().getEmail(), "BALANCENEURAL", new Template()
							.contentTemplateRecoverPassword(informacion.get("nuevaContrasena").toString(), doctor.getUsuario().getEmail()));
				} catch (MessagingException e) {
					
					e.printStackTrace();
				}
				
			}
			return bandera;
		}
	    
	    

}
