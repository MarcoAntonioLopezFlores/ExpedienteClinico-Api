package mx.com.balanceneural.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.balanceneural.services.entity.Expediente;
import mx.com.balanceneural.services.entity.Paciente;

public interface ExpedienteRepository extends JpaRepository<Expediente, Long>{
	Expediente findByPaciente(Paciente paciente);
	boolean existsByPaciente(Paciente paciente);
}
