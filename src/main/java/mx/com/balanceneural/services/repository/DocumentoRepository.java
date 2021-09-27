package mx.com.balanceneural.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import mx.com.balanceneural.services.entity.Documento;
import mx.com.balanceneural.services.entity.Paciente;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
	List<Documento> findAllByPaciente(Paciente paciente);
}
