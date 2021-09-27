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

import mx.com.balanceneural.services.Service.RevisionService;
import mx.com.balanceneural.services.entity.RevisionFisica;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/revision")
public class RevisionController {

	@Autowired
	private RevisionService revisionService;
	
	@PostMapping(value = "/registrar")
	public RevisionFisica save(@RequestBody RevisionFisica revisionFisica){

		return revisionService.saveRevisionFisica(revisionFisica);
	}

	@GetMapping("/getAll/{id}")
	public List<RevisionFisica> getAll(@PathVariable Long id){
		return revisionService.getAllByPaciente(id);
	}

	@GetMapping("/getOne/{id}")
	public RevisionFisica getOne(@PathVariable Long id){
		return revisionService.getOne(id);
	}
}
