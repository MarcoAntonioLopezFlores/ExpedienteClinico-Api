package mx.com.balanceneural.services.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.entity.RevisionFisica;
import mx.com.balanceneural.services.repository.RevisionFisicaRepository;

@Service
public class RevisionService {

	@Autowired
	private RevisionFisicaRepository fisicaRepository;
	
	public RevisionFisica saveRevisionFisica(RevisionFisica revisionFisica) {
		return fisicaRepository.save(revisionFisica);
	}
	
	
	public List<RevisionFisica> getAllByPaciente(Long id){
		Paciente paciente = new Paciente();
		paciente.setId(id);
		
		return fisicaRepository.findAllByPaciente(paciente);
	}
	
	public RevisionFisica getOne(Long id) {
		return fisicaRepository.findById(id).get();
	}
}
