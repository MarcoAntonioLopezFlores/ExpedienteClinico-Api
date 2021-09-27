package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadera {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String caderaFlexionIzq;
	private String caderaFlexionDer;

	private String caderaExtensionIzq;
	private String caderaExtensionDer;

	private String caderaAbduccionIzq;
	private String caderaAbduccionDer;
	private String caderaAduccionIzq;
	private String caderaAduccionDer;

	private String caderaRotacionIntDer;
	private String caderaRotacionIntIzq;
	private String caderaRotacionExtDer;
	private String caderaRotacionExtIzq;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCaderaFlexionIzq() {
		return caderaFlexionIzq;
	}
	public void setCaderaFlexionIzq(String caderaFlexionIzq) {
		this.caderaFlexionIzq = caderaFlexionIzq;
	}
	public String getCaderaFlexionDer() {
		return caderaFlexionDer;
	}
	public void setCaderaFlexionDer(String caderaFlexionDer) {
		this.caderaFlexionDer = caderaFlexionDer;
	}
	public String getCaderaExtensionIzq() {
		return caderaExtensionIzq;
	}
	public void setCaderaExtensionIzq(String caderaExtensionIzq) {
		this.caderaExtensionIzq = caderaExtensionIzq;
	}
	public String getCaderaExtensionDer() {
		return caderaExtensionDer;
	}
	public void setCaderaExtensionDer(String caderaExtensionDer) {
		this.caderaExtensionDer = caderaExtensionDer;
	}
	public String getCaderaAbduccionIzq() {
		return caderaAbduccionIzq;
	}
	public void setCaderaAbduccionIzq(String caderaAbduccionIzq) {
		this.caderaAbduccionIzq = caderaAbduccionIzq;
	}
	public String getCaderaAbduccionDer() {
		return caderaAbduccionDer;
	}
	public void setCaderaAbduccionDer(String caderaAbduccionDer) {
		this.caderaAbduccionDer = caderaAbduccionDer;
	}
	public String getCaderaAduccionIzq() {
		return caderaAduccionIzq;
	}
	public void setCaderaAduccionIzq(String caderaAduccionIzq) {
		this.caderaAduccionIzq = caderaAduccionIzq;
	}
	public String getCaderaAduccionDer() {
		return caderaAduccionDer;
	}
	public void setCaderaAduccionDer(String caderaAduccionDer) {
		this.caderaAduccionDer = caderaAduccionDer;
	}
	public String getCaderaRotacionIntDer() {
		return caderaRotacionIntDer;
	}
	public void setCaderaRotacionIntDer(String caderaRotacionIntDer) {
		this.caderaRotacionIntDer = caderaRotacionIntDer;
	}
	public String getCaderaRotacionIntIzq() {
		return caderaRotacionIntIzq;
	}
	public void setCaderaRotacionIntIzq(String caderaRotacionIntIzq) {
		this.caderaRotacionIntIzq = caderaRotacionIntIzq;
	}
	public String getCaderaRotacionExtDer() {
		return caderaRotacionExtDer;
	}
	public void setCaderaRotacionExtDer(String caderaRotacionExtDer) {
		this.caderaRotacionExtDer = caderaRotacionExtDer;
	}
	public String getCaderaRotacionExtIzq() {
		return caderaRotacionExtIzq;
	}
	public void setCaderaRotacionExtIzq(String caderaRotacionExtIzq) {
		this.caderaRotacionExtIzq = caderaRotacionExtIzq;
	}
	
	

}
