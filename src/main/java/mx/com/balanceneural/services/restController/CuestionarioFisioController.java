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

import mx.com.balanceneural.services.Service.CuestionarioFisioService;
import mx.com.balanceneural.services.entity.CuestionarioFisio;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/fisio")
public class CuestionarioFisioController {
	
	@Autowired
	private CuestionarioFisioService cuestionarioService;

	@PostMapping(value = "/registrar")
	public CuestionarioFisio save(@RequestBody CuestionarioFisio cuestionario){

		return cuestionarioService.saveCuestionario(cuestionario);
	}

	@GetMapping("/getAll/{id}")
	public List<CuestionarioFisio> getAll(@PathVariable Long id){
		return cuestionarioService.getAllByPaciente(id);
	}

	@GetMapping("/getOne/{id}")
	public CuestionarioFisio getOne(@PathVariable Long id){
		return cuestionarioService.getOne(id);
	}


}
