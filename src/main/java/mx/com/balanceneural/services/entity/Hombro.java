package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hombro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String hombroFlexionIzq;
	private String hombroFlexionDer;

	private String hombroExtensionIzq;
	private String hombroExtensionDer;

	private String hombroAbduccionIzq;
	private String hombroAbduccionDer;
	private String hombroAduccionIzq;
	private String hombroAduccionDer;

	private String hombroRotacionIntDer;
	private String hombroRotacionIntIzq;
	private String hombroRotacionExtDer;
	private String hombroRotacionExtIzq;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHombroFlexionIzq() {
		return hombroFlexionIzq;
	}
	public void setHombroFlexionIzq(String hombroFlexionIzq) {
		this.hombroFlexionIzq = hombroFlexionIzq;
	}
	public String getHombroFlexionDer() {
		return hombroFlexionDer;
	}
	public void setHombroFlexionDer(String hombroFlexionDer) {
		this.hombroFlexionDer = hombroFlexionDer;
	}
	public String getHombroExtensionIzq() {
		return hombroExtensionIzq;
	}
	public void setHombroExtensionIzq(String hombroExtensionIzq) {
		this.hombroExtensionIzq = hombroExtensionIzq;
	}
	public String getHombroExtensionDer() {
		return hombroExtensionDer;
	}
	public void setHombroExtensionDer(String hombroExtensionDer) {
		this.hombroExtensionDer = hombroExtensionDer;
	}
	public String getHombroAbduccionIzq() {
		return hombroAbduccionIzq;
	}
	public void setHombroAbduccionIzq(String hombroAbduccionIzq) {
		this.hombroAbduccionIzq = hombroAbduccionIzq;
	}
	public String getHombroAbduccionDer() {
		return hombroAbduccionDer;
	}
	public void setHombroAbduccionDer(String hombroAbduccionDer) {
		this.hombroAbduccionDer = hombroAbduccionDer;
	}
	public String getHombroAduccionIzq() {
		return hombroAduccionIzq;
	}
	public void setHombroAduccionIzq(String hombroAduccionIzq) {
		this.hombroAduccionIzq = hombroAduccionIzq;
	}
	public String getHombroAduccionDer() {
		return hombroAduccionDer;
	}
	public void setHombroAduccionDer(String hombroAduccionDer) {
		this.hombroAduccionDer = hombroAduccionDer;
	}
	public String getHombroRotacionIntDer() {
		return hombroRotacionIntDer;
	}
	public void setHombroRotacionIntDer(String hombroRotacionIntDer) {
		this.hombroRotacionIntDer = hombroRotacionIntDer;
	}
	public String getHombroRotacionIntIzq() {
		return hombroRotacionIntIzq;
	}
	public void setHombroRotacionIntIzq(String hombroRotacionIntIzq) {
		this.hombroRotacionIntIzq = hombroRotacionIntIzq;
	}
	public String getHombroRotacionExtDer() {
		return hombroRotacionExtDer;
	}
	public void setHombroRotacionExtDer(String hombroRotacionExtDer) {
		this.hombroRotacionExtDer = hombroRotacionExtDer;
	}
	public String getHombroRotacionExtIzq() {
		return hombroRotacionExtIzq;
	}
	public void setHombroRotacionExtIzq(String hombroRotacionExtIzq) {
		this.hombroRotacionExtIzq = hombroRotacionExtIzq;
	}
	
	
}
