package mx.com.balanceneural.services.configuration;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import mx.com.balanceneural.services.entity.Usuario;
import mx.com.balanceneural.services.repository.AdministradorRepository;
import mx.com.balanceneural.services.repository.DoctorRepository;
import mx.com.balanceneural.services.repository.PacienteRepository;
import mx.com.balanceneural.services.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenUtil implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

	@Value("${jwt.secret}")
	private String secret;

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private PacienteRepository pacienteRepository;
	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private AdministradorRepository administradorRepository;


	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}

	public Date getIssuedAtDateFromToken(String token) {
		return getClaimFromToken(token, Claims::getIssuedAt);
	}

	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token, Claims::getExpiration);
	}

	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}

	private Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}

	private Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}

	private Boolean ignoreTokenExpiration(String token) {
		return false;
	}

	public String generateToken(UserDetails ud) {
		Map<String, Object> claims = new HashMap<String, Object>();
		Usuario usuario = usuarioRepository.findByEmail(ud.getUsername());
		//System.out.println("usuario: " + usuario.getEmail() + " con el rol de: " + usuario.getRol().getRolName());
			if (usuario.getRol().getRolName().equals("ROLE_PACIENTE")){
				claims.put("perfil", pacienteRepository.findByUsuario(usuario));
			}else if(usuario.getRol().getRolName().equals("ROLE_DOCTOR")){
				claims.put("perfil", doctorRepository.findByUsuario(usuario));
			}else if (usuario.getRol().getRolName().equals("ROLE_ADMIN")){
				claims.put("perfil", administradorRepository.findByUsuario(usuario));
			}
			return doGenerateToken(claims, ud.getUsername());
	}

	private String doGenerateToken(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 2000))
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}

	public boolean canTokenBeRefreshed(String token) {
		return (!isTokenExpired(token) || ignoreTokenExpiration(token));
	}

	public Boolean validateToken(String token, UserDetails details) {
		final String username = getUsernameFromToken(token);
		return (username.equals(details.getUsername()));
	}
}
