package mx.com.balanceneural.services.Service;

import mx.com.balanceneural.services.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.Expediente;

import mx.com.balanceneural.services.repository.ExpedienteRepository;
import mx.com.balanceneural.services.repository.FichaRepository;
import mx.com.balanceneural.services.repository.PacienteRepository;

@Service
public class ExpedienteService {

	@Autowired
	private ExpedienteRepository expedienteRepository;

	@Autowired
	private PacienteRepository pacienteRepository;
	@Autowired
	private FichaRepository fichaRepository;

	public Expediente saveExpediente(Expediente expediente){
		expediente.setFicha(fichaRepository.save(expediente.getFicha()));
		expediente.setPaciente(pacienteRepository.findById(expediente.getPaciente().getId()).get());
		return expedienteRepository.save(expediente);
	}

	public Expediente getExpediente(Long idPaciente) {
		return expedienteRepository.findByPaciente(pacienteRepository.findById(idPaciente).get());
	}

	public boolean existByPaciente(Long id){
		Paciente paciente= new  Paciente();
		paciente.setId(id);
		return expedienteRepository.existsByPaciente(paciente);
	}
}
