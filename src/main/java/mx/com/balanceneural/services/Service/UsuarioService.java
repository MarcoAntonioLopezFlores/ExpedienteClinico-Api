package mx.com.balanceneural.services.Service;


import mx.com.balanceneural.services.entity.Usuario;
import mx.com.balanceneural.services.repository.AdministradorRepository;
import mx.com.balanceneural.services.repository.DoctorRepository;
import mx.com.balanceneural.services.repository.PacienteRepository;
import mx.com.balanceneural.services.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    AdministradorRepository administradorRepository;

    public boolean validateCredentials(String contrasenia, String encode) {
        return passwordEncoder.matches(contrasenia,encode);
    }

    public boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public Usuario findUsuarioByEmail(String email){return usuarioRepository.findByEmail(email);}

    public boolean existsById(Long id) {
        return usuarioRepository.existsById(id);
    }

    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
        return !usuarioRepository.existsById(usuario.getId());
    }

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario != null) {
            List<GrantedAuthority> authorities = getUserAuthority(usuario.getRol().getRolName());
            return buildUserForAuthentication(usuario, authorities);
        } else {
            throw new UsernameNotFoundException("Username not found");
        }
    }

    private List<GrantedAuthority> getUserAuthority(String userRol) {
        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority(userRol));
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
        return grantedAuthorities;
    }

    private UserDetails buildUserForAuthentication(Usuario usuario, List<GrantedAuthority> authorities) {
        return new User(usuario.getEmail(), usuario.getPassword(), authorities);
    }
}
