package mx.com.balanceneural.services.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.Cuestionario;
import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.repository.CuestionarioRepository;

@Service
public class CuestionarioService {

	@Autowired
	private CuestionarioRepository cuestionarioRepository;
	
	public Cuestionario saveCuestionario(Cuestionario cuestionario) {
		return cuestionarioRepository.save(cuestionario);
	}
	
	
	public List<Cuestionario> getAllByPaciente(Long id){
		Paciente paciente = new Paciente();
		paciente.setId(id);
		return cuestionarioRepository.findAllByPaciente(paciente);
	}
	
	public Cuestionario getOne(Long id) {
		return cuestionarioRepository.findById(id).get();
	}
}
