package mx.com.balanceneural.services.Service;

import mx.com.balanceneural.services.entity.Nota;
import mx.com.balanceneural.services.entity.Paciente;

import mx.com.balanceneural.services.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService {

    @Autowired
    NotaRepository notaRepository;
    
   

    public Nota save(Nota nota) {
        
        return notaRepository.save(nota);
    }
    
    
    public List<Nota> findAllByPaciente(Long id){
        Paciente paciente = new Paciente();
        paciente.setId(id);
        return notaRepository.getAllByPaciente(paciente);
    }

    public boolean delete(Long id){
        notaRepository.deleteById(id);
        return !notaRepository.existsById(id);
    }

    
}
