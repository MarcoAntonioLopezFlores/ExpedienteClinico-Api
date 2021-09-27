package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Raquis {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String raquisFlexionIzq;
	private String raquisFlexionDer;
	private String raquisExtensionIzq;
	private String raquisExtensionDer;
	private String raquisInclinacionIzq;
	private String raquisInclinacionDer;
	private String raquisRotacionIzq;
	private String raquisRotacionDer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRaquisFlexionIzq() {
		return raquisFlexionIzq;
	}
	public void setRaquisFlexionIzq(String raquisFlexionIzq) {
		this.raquisFlexionIzq = raquisFlexionIzq;
	}
	public String getRaquisFlexionDer() {
		return raquisFlexionDer;
	}
	public void setRaquisFlexionDer(String raquisFlexionDer) {
		this.raquisFlexionDer = raquisFlexionDer;
	}
	public String getRaquisExtensionIzq() {
		return raquisExtensionIzq;
	}
	public void setRaquisExtensionIzq(String raquisExtensionIzq) {
		this.raquisExtensionIzq = raquisExtensionIzq;
	}
	public String getRaquisExtensionDer() {
		return raquisExtensionDer;
	}
	public void setRaquisExtensionDer(String raquisExtensionDer) {
		this.raquisExtensionDer = raquisExtensionDer;
	}
	public String getRaquisInclinacionIzq() {
		return raquisInclinacionIzq;
	}
	public void setRaquisInclinacionIzq(String raquisInclinacionIzq) {
		this.raquisInclinacionIzq = raquisInclinacionIzq;
	}
	public String getRaquisInclinacionDer() {
		return raquisInclinacionDer;
	}
	public void setRaquisInclinacionDer(String raquisInclinacionDer) {
		this.raquisInclinacionDer = raquisInclinacionDer;
	}
	public String getRaquisRotacionIzq() {
		return raquisRotacionIzq;
	}
	public void setRaquisRotacionIzq(String raquisRotacionIzq) {
		this.raquisRotacionIzq = raquisRotacionIzq;
	}
	public String getRaquisRotacionDer() {
		return raquisRotacionDer;
	}
	public void setRaquisRotacionDer(String raquisRotacionDer) {
		this.raquisRotacionDer = raquisRotacionDer;
	}
	
	

}
