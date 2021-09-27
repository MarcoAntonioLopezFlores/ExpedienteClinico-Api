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

import mx.com.balanceneural.services.Service.OdontogramaService;
import mx.com.balanceneural.services.entity.Odontograma;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/odontograma")
public class OdontogramaController {

	@Autowired
	private OdontogramaService odontogramaService;

	@PostMapping(value = "/registrar")
	public Odontograma save(@RequestBody Odontograma odontograma){

		return odontogramaService.saveOdontograma(odontograma);
	}

	@GetMapping("/getAll/{id}")
	public List<Odontograma> getAll(@PathVariable Long id){
		return odontogramaService.getAllByPaciente(id);
	}

	@GetMapping("/getOne/{id}")
	public Odontograma getOne(@PathVariable Long id){
		return odontogramaService.getOne(id);
	}

}
