package mx.com.balanceneural.services.restController;

import mx.com.balanceneural.services.Service.UsuarioService;
import mx.com.balanceneural.services.configuration.JwtResponse;
import mx.com.balanceneural.services.configuration.JwtTokenUtil;
import mx.com.balanceneural.services.entity.Usuario;

import mx.com.balanceneural.services.utilidades.EmailService;
import mx.com.balanceneural.services.utilidades.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
@RequestMapping("/balanceneuralAPI")
public class LoginController {

	@Autowired
	UsuarioService usuarioService;
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private EmailService emailService;
	@Autowired
	private PasswordEncoder passwordEncoder;


	@PostMapping(value = "/iniciarSesion")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody Usuario authenticationRequest) throws Exception {
		final UserDetails userDetails = usuarioService.loadUserByUsername(authenticationRequest.getEmail());
		if (usuarioService.validateCredentials(authenticationRequest.getPassword(), userDetails.getPassword())) {
			final String token = jwtTokenUtil.generateToken(userDetails);
			return ResponseEntity.ok(new JwtResponse(token));
		} else {
			System.out.println("las contraseñas no coinciden");
			return ResponseEntity.ok(new JwtResponse(null));
		}
	}

	@PostMapping(value = "/recuperarCredenciales")
	public boolean recuperarContrasenia(@RequestBody Usuario usuarioRequest) {
		if (usuarioService.existsByEmail(usuarioRequest.getEmail())) {
			final Usuario usuario = usuarioService.findUsuarioByEmail(usuarioRequest.getEmail());
			usuario.setPassword(passwordEncoder.encode(usuarioRequest.getPassword()));
			usuarioService.update(usuario);
			try {
				emailService.sendEmail(usuario.getEmail(), "BALANCENEURAL", new Template()
						.contentTemplateRecoverPassword(usuarioRequest.getPassword(), usuario.getEmail()));
				return true;
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		}
			return false;
	}
}
