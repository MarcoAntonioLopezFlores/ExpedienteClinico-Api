package mx.com.balanceneural.services.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.CuestionarioFisio;
import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.repository.CuestionarioFisioRepository;

@Service
public class CuestionarioFisioService {

	@Autowired
	private CuestionarioFisioRepository cuestionarioRepository;
	
	public CuestionarioFisio saveCuestionario(CuestionarioFisio cuestionario) {
		return cuestionarioRepository.save(cuestionario);
	}
	
	
	public List<CuestionarioFisio> getAllByPaciente(Long id){
		Paciente paciente = new Paciente();
		paciente.setId(id);
		return cuestionarioRepository.findAllByPaciente(paciente);
	}
	
	public CuestionarioFisio getOne(Long id) {
		return cuestionarioRepository.findById(id).get();
	}
}
