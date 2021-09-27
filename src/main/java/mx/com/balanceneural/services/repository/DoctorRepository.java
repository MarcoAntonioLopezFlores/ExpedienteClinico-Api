package mx.com.balanceneural.services.repository;

import mx.com.balanceneural.services.entity.Doctor;
import mx.com.balanceneural.services.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    Doctor findByUsuario(Usuario usuario);
    boolean existsByNombreAndApellido(String nombre, String apellido);
}
