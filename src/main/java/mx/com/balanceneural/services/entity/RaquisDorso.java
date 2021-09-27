package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RaquisDorso {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String raquisDorsoFlexionIzq;
	private String raquisDorsoFlexionDer;
	private String raquisDorsoExtensionIzq;
	private String raquisDorsoExtensionDer;
	private String raquisDorsoInclinacionIzq;
	private String raquisDorsoInclinacionDer;
	private String raquisDorsoRotacionIzq;
	private String raquisDorsoRotacionDer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRaquisDorsoFlexionIzq() {
		return raquisDorsoFlexionIzq;
	}
	public void setRaquisDorsoFlexionIzq(String raquisDorsoFlexionIzq) {
		this.raquisDorsoFlexionIzq = raquisDorsoFlexionIzq;
	}
	public String getRaquisDorsoFlexionDer() {
		return raquisDorsoFlexionDer;
	}
	public void setRaquisDorsoFlexionDer(String raquisDorsoFlexionDer) {
		this.raquisDorsoFlexionDer = raquisDorsoFlexionDer;
	}
	public String getRaquisDorsoExtensionIzq() {
		return raquisDorsoExtensionIzq;
	}
	public void setRaquisDorsoExtensionIzq(String raquisDorsoExtensionIzq) {
		this.raquisDorsoExtensionIzq = raquisDorsoExtensionIzq;
	}
	public String getRaquisDorsoExtensionDer() {
		return raquisDorsoExtensionDer;
	}
	public void setRaquisDorsoExtensionDer(String raquisDorsoExtensionDer) {
		this.raquisDorsoExtensionDer = raquisDorsoExtensionDer;
	}
	public String getRaquisDorsoInclinacionIzq() {
		return raquisDorsoInclinacionIzq;
	}
	public void setRaquisDorsoInclinacionIzq(String raquisDorsoInclinacionIzq) {
		this.raquisDorsoInclinacionIzq = raquisDorsoInclinacionIzq;
	}
	public String getRaquisDorsoInclinacionDer() {
		return raquisDorsoInclinacionDer;
	}
	public void setRaquisDorsoInclinacionDer(String raquisDorsoInclinacionDer) {
		this.raquisDorsoInclinacionDer = raquisDorsoInclinacionDer;
	}
	public String getRaquisDorsoRotacionIzq() {
		return raquisDorsoRotacionIzq;
	}
	public void setRaquisDorsoRotacionIzq(String raquisDorsoRotacionIzq) {
		this.raquisDorsoRotacionIzq = raquisDorsoRotacionIzq;
	}
	public String getRaquisDorsoRotacionDer() {
		return raquisDorsoRotacionDer;
	}
	public void setRaquisDorsoRotacionDer(String raquisDorsoRotacionDer) {
		this.raquisDorsoRotacionDer = raquisDorsoRotacionDer;
	}

	
}
