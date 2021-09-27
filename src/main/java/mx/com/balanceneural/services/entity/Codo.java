package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Codo {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	private String codoFlexionIzq;
	private String codoFlexionDer;
	private String codoExtensionIzq;
	private String codoExtensionDer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodoFlexionIzq() {
		return codoFlexionIzq;
	}
	public void setCodoFlexionIzq(String codoFlexionIzq) {
		this.codoFlexionIzq = codoFlexionIzq;
	}
	public String getCodoFlexionDer() {
		return codoFlexionDer;
	}
	public void setCodoFlexionDer(String codoFlexionDer) {
		this.codoFlexionDer = codoFlexionDer;
	}
	public String getCodoExtensionIzq() {
		return codoExtensionIzq;
	}
	public void setCodoExtensionIzq(String codoExtensionIzq) {
		this.codoExtensionIzq = codoExtensionIzq;
	}
	public String getCodoExtensionDer() {
		return codoExtensionDer;
	}
	public void setCodoExtensionDer(String codoExtensionDer) {
		this.codoExtensionDer = codoExtensionDer;
	}
	
}
