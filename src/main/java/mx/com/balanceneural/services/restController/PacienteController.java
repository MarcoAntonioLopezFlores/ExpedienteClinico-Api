package mx.com.balanceneural.services.restController;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.balanceneural.services.Service.PacienteService;
import mx.com.balanceneural.services.entity.Paciente;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;

	@PostMapping(value = "/registrarPaciente")
	public boolean save(@RequestBody Paciente pacienteRequest){
		pacienteRequest.setFechaRegistro(new Date());
		return pacienteService.savePaciente(pacienteRequest);

	}

	@GetMapping(value = "/obtenerPacientes")
	public List<Paciente> obtenerPacientes(){
		return pacienteService.getAllPacientes();
	}

	@GetMapping(value = "/obtenerPaciente/{id}")
	public Paciente obtenerPacientes(@PathVariable("id") Long id){
		return pacienteService.getPaciente(id);
	}
	
	@PostMapping("/updatePassPaciente/{paciente}")
	public Boolean updateOldPassDirectivo(@PathVariable("paciente") long id, @RequestBody Map<String, Object> informacion) {
		System.out.println(id);
		System.out.println(informacion);
		return pacienteService.updatePass(id, informacion);
	}


}
