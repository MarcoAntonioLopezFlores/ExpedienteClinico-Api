package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rodilla {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	private String rodillaFlexionIzq;
	private String rodillaFlexionDer;
	private String rodillaExtensionIzq;
	private String rodillaExtensionDer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRodillaFlexionIzq() {
		return rodillaFlexionIzq;
	}
	public void setRodillaFlexionIzq(String rodillaFlexionIzq) {
		this.rodillaFlexionIzq = rodillaFlexionIzq;
	}
	public String getRodillaFlexionDer() {
		return rodillaFlexionDer;
	}
	public void setRodillaFlexionDer(String rodillaFlexionDer) {
		this.rodillaFlexionDer = rodillaFlexionDer;
	}
	public String getRodillaExtensionIzq() {
		return rodillaExtensionIzq;
	}
	public void setRodillaExtensionIzq(String rodillaExtensionIzq) {
		this.rodillaExtensionIzq = rodillaExtensionIzq;
	}
	public String getRodillaExtensionDer() {
		return rodillaExtensionDer;
	}
	public void setRodillaExtensionDer(String rodillaExtensionDer) {
		this.rodillaExtensionDer = rodillaExtensionDer;
	}
	
}
