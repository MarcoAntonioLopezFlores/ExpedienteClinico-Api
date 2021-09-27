package mx.com.balanceneural.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.balanceneural.services.entity.CuestionarioFisio;
import mx.com.balanceneural.services.entity.Paciente;

public interface CuestionarioFisioRepository extends JpaRepository<CuestionarioFisio, Long>{
	List<CuestionarioFisio> findAllByPaciente(Paciente paciente);
}
