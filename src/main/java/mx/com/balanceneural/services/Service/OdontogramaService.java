package mx.com.balanceneural.services.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.balanceneural.services.entity.Odontograma;
import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.repository.OdontogramaRepository;

@Service
public class OdontogramaService {

	@Autowired
	private OdontogramaRepository odontogramaRepository;
	
	public Odontograma saveOdontograma(Odontograma odontograma) {
		return odontogramaRepository.save(odontograma);
	}
	
	
	public List<Odontograma> getAllByPaciente(Long id){
		Paciente paciente = new Paciente();
		paciente.setId(id);
		return odontogramaRepository.findAllByPaciente(paciente);
	}
	
	public Odontograma getOne(Long id) {
		return odontogramaRepository.findById(id).get();
	}
}
