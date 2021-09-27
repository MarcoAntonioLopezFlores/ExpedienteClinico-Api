package mx.com.balanceneural.services.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.balanceneural.services.Service.FichaService;

import mx.com.balanceneural.services.entity.Ficha;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/ficha")
public class FichaController {

	@Autowired
	private FichaService fichaService;

	@PostMapping(value = "/registrar")
	public Long save(@RequestBody Ficha ficha){
		return fichaService.save(ficha);
	}
}
