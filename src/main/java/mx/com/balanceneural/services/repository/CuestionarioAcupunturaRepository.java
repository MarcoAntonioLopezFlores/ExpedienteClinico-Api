package mx.com.balanceneural.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.balanceneural.services.entity.CuestionarioAcupuntura;

import mx.com.balanceneural.services.entity.Paciente;

public interface CuestionarioAcupunturaRepository extends JpaRepository<CuestionarioAcupuntura, Long> {
	List<CuestionarioAcupuntura> findAllByPaciente(Paciente paciente);
}
