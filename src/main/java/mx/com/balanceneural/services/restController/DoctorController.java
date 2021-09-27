package mx.com.balanceneural.services.restController;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.balanceneural.services.Service.DoctorService;
import mx.com.balanceneural.services.entity.Doctor;
@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/registrarDoctor")
	public boolean save(@RequestBody Doctor doctorRequest){
		return doctorService.saveDoctor(doctorRequest);
	}
	
	@GetMapping("/obtenerDoctores")
	public List<Doctor> getAllDoctores(){
		return doctorService.getDoctores();
	}
	
	@PutMapping("/actualizarDoctor")
	public Doctor actualizarDoctor(@RequestBody Doctor doctorRequest) {
		return doctorService.updateDoctor(doctorRequest);
	}
	
	@GetMapping("/obtenerDoctor/{id}")
	public Doctor obtenerDoctor(@PathVariable("id") Long id){
		return doctorService.getDoctor(id);
	}
	
	@GetMapping("/eliminarDoctor/{id}")
	public boolean borrarDoctor(@PathVariable("id") Long id){
		return doctorService.deleteDoctor(id);
	}
	
	@PostMapping("/updatePassDoctor/{doctor}")
	public Boolean updateOldPassDirectivo(@PathVariable("doctor") long id, @RequestBody Map<String, Object> informacion) {
		return doctorService.updatePass(id, informacion);
	}
	
	
	

}
