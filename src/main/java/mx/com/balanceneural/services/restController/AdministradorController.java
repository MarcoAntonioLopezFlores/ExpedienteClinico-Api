package mx.com.balanceneural.services.restController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.balanceneural.services.Service.AdministradorService;
import mx.com.balanceneural.services.entity.Administrador;
@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI")
public class AdministradorController {

	@Autowired
	private AdministradorService adminService;
	
	@PostMapping(value = "/registrarAdministrador")
	public boolean save(@RequestBody Administrador administradorRequest){
		return adminService.saveAdministrador(administradorRequest);
	}
	
	@PostMapping("/updatePassAdministrador/{admin}")
	public Boolean updateOldPassDirectivo(@PathVariable("admin") long id, @RequestBody Map<String, Object> informacion) {
		
		return adminService.updatePass(id, informacion);
	}
}
