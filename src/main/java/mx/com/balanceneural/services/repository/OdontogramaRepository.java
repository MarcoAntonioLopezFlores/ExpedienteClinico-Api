package mx.com.balanceneural.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import mx.com.balanceneural.services.entity.Odontograma;
import mx.com.balanceneural.services.entity.Paciente;

public interface OdontogramaRepository extends JpaRepository<Odontograma, Long> {
	List<Odontograma> findAllByPaciente(Paciente paciente);
}
