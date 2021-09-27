package mx.com.balanceneural.services.repository;

import mx.com.balanceneural.services.entity.Paciente;
import mx.com.balanceneural.services.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findByUsuario(Usuario usuario);
    boolean existsByNombreAndApellido(String nombre,String apellido);
}
