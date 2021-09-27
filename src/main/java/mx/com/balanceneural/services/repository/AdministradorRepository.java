package mx.com.balanceneural.services.repository;

import mx.com.balanceneural.services.entity.Administrador;
import mx.com.balanceneural.services.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Long> {
    Administrador findByUsuario(Usuario usuario);
    boolean existsByNombreAndApellido(String nombre,String apellido);
}
