package mx.com.balanceneural.services.restController;

import mx.com.balanceneural.services.Service.NotaService;
import mx.com.balanceneural.services.entity.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI/nota")
public class NotaController {

    @Autowired
    NotaService notaService;

    @PostMapping(value = "/registrar")
    public Nota registrarNota(@RequestBody Nota nota){
        return notaService.save(nota);
    }

    @GetMapping("/getAll/{id}")
	public List<Nota> getAllByPaciente(@PathVariable Long id){
		return notaService.findAllByPaciente(id);
	}

    

    
}
