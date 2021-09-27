package mx.com.balanceneural.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.entity.RevisionFisica;

public interface RevisionFisicaRepository extends JpaRepository<RevisionFisica, Long> {
	List<RevisionFisica> findAllByPaciente(Paciente paciente);
}
