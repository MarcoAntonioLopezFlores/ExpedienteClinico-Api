package mx.com.balanceneural.services.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.balanceneural.services.Service.ExpedienteService;
import mx.com.balanceneural.services.entity.Expediente;


@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/expediente")
public class ExpedienteController {

	@Autowired
	private ExpedienteService expedienteService;

	@PostMapping("/registrar")
	public Expediente registrarExpediente(@RequestBody Expediente expediente) {
		return expedienteService.saveExpediente(expediente);
	}

	@GetMapping("/obtenerExpediente/{id}")
	public Expediente obtenerExpediente(@PathVariable("id") Long id) {
		return expedienteService.getExpediente(id);
	}

	@GetMapping("/existeExpediente/{id}")
	public boolean existeExpediente(@PathVariable("id") Long id) {
		return expedienteService.existByPaciente(id);
	}
}
