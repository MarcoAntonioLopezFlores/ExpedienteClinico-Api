package mx.com.balanceneural.services.repository;

import mx.com.balanceneural.services.entity.Nota;
import mx.com.balanceneural.services.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotaRepository extends JpaRepository<Nota,Long> {
    List<Nota> getAllByPaciente(Paciente paciente);
    
}
