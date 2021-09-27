package mx.com.balanceneural.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.balanceneural.services.entity.Cuestionario;
import mx.com.balanceneural.services.entity.Paciente;

public interface CuestionarioRepository extends JpaRepository<Cuestionario, Long> {
	List<Cuestionario> findAllByPaciente(Paciente paciente);
}
