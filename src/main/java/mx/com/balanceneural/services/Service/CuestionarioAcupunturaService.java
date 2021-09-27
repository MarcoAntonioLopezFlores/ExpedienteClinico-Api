package mx.com.balanceneural.services.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.CuestionarioAcupuntura;
import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.repository.CuestionarioAcupunturaRepository;

@Service
public class CuestionarioAcupunturaService {
	
	@Autowired
	private CuestionarioAcupunturaRepository acupunturaRepository;
	
	public CuestionarioAcupuntura saveCuestionario(CuestionarioAcupuntura cuestionario) {
		return acupunturaRepository.save(cuestionario);
	}
	
	
	public List<CuestionarioAcupuntura> getAllByPaciente(Long id){
		Paciente paciente = new Paciente();
		paciente.setId(id);
		return acupunturaRepository.findAllByPaciente(paciente);
	}
	
	public CuestionarioAcupuntura getOne(Long id) {
		return acupunturaRepository.findById(id).get();
	}

}
