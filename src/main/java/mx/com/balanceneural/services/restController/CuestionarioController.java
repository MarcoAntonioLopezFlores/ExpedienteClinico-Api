package mx.com.balanceneural.services.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.balanceneural.services.Service.CuestionarioService;
import mx.com.balanceneural.services.entity.Cuestionario;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/cuestionario")
public class CuestionarioController {

	@Autowired
	private CuestionarioService cuestionarioService;

	@PostMapping(value = "/registrar")
	public Cuestionario save(@RequestBody Cuestionario cuestionario){

		return cuestionarioService.saveCuestionario(cuestionario);
	}

	@GetMapping("/getAll/{id}")
	public List<Cuestionario> getAll(@PathVariable Long id){
		return cuestionarioService.getAllByPaciente(id);
	}

	@GetMapping("/getOne/{id}")
	public Cuestionario getOne(@PathVariable Long id){
		return cuestionarioService.getOne(id);
	}


}
