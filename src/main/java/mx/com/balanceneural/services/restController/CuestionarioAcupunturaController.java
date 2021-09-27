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

import mx.com.balanceneural.services.Service.CuestionarioAcupunturaService;
import mx.com.balanceneural.services.entity.CuestionarioAcupuntura;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/acupuntura")
public class CuestionarioAcupunturaController {
	
	@Autowired
	private CuestionarioAcupunturaService acupunturaService;
	
	@PostMapping(value = "/registrar")
	public CuestionarioAcupuntura save(@RequestBody CuestionarioAcupuntura cuestionario){

		return acupunturaService.saveCuestionario(cuestionario);
	}

	@GetMapping("/getAll/{id}")
	public List<CuestionarioAcupuntura> getAll(@PathVariable Long id){
		return acupunturaService.getAllByPaciente(id);
	}

	@GetMapping("/getOne/{id}")
	public CuestionarioAcupuntura getOne(@PathVariable Long id){
		return acupunturaService.getOne(id);
	}



}
