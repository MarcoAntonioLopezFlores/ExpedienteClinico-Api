package mx.com.balanceneural.services.configuration;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.jsonwebtoken.ExpiredJwtException;
import mx.com.balanceneural.services.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtRequestFilter extends OncePerRequestFilter{

	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	@Autowired
	private UsuarioService usuarioService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		final String requestTokenHeader = request.getHeader("Authorization");

		String username=null;
		String jwtToken=null;

		if (requestTokenHeader!=null && requestTokenHeader.startsWith("Bearer")) {
			try {
				jwtToken = requestTokenHeader.substring(6);
				//System.out.println("token: " + jwtToken);
				username= jwtTokenUtil.getUsernameFromToken(jwtToken);
			} catch (IllegalArgumentException e) {
				System.out.println("Unable to get JWT Token");
			}catch(ExpiredJwtException e) {
				System.out.println("JWT Token has Expired");
			}
		} else {
			logger.warn("JWT Token does not begin with Bearer String");
		}

		if (username!=null && SecurityContextHolder.getContext().getAuthentication()== null) {
			UserDetails details = usuarioService.loadUserByUsername(username);

			if (jwtTokenUtil.validateToken(jwtToken,details)) {
				UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(details, null,details.getAuthorities());
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}
		}
		filterChain.doFilter(request,response);
	}

}
