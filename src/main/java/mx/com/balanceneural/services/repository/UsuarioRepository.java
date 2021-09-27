package mx.com.balanceneural.services.repository;
import mx.com.balanceneural.services.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByEmailAndPassword(String email, String password);
    boolean existsByEmail(String email);
    Usuario findByEmail(String email);
}
