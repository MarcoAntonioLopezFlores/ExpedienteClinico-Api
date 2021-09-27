package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tobillo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String tobilloInversionIzq;
	private String tobilloInversionDer;
	private String tobilloEversionIzq;
	private String tobilloEversionDer;
	private String tobilloFlexionPlantarIzq;
	private String tobilloFlexionPlantarDer;
	private String tobilloFlexionDorsalIzq;
	private String tobilloFlexionDorsalDer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTobilloInversionIzq() {
		return tobilloInversionIzq;
	}
	public void setTobilloInversionIzq(String tobilloInversionIzq) {
		this.tobilloInversionIzq = tobilloInversionIzq;
	}
	public String getTobilloInversionDer() {
		return tobilloInversionDer;
	}
	public void setTobilloInversionDer(String tobilloInversionDer) {
		this.tobilloInversionDer = tobilloInversionDer;
	}
	public String getTobilloEversionIzq() {
		return tobilloEversionIzq;
	}
	public void setTobilloEversionIzq(String tobilloEversionIzq) {
		this.tobilloEversionIzq = tobilloEversionIzq;
	}
	public String getTobilloEversionDer() {
		return tobilloEversionDer;
	}
	public void setTobilloEversionDer(String tobilloEversionDer) {
		this.tobilloEversionDer = tobilloEversionDer;
	}
	public String getTobilloFlexionPlantarIzq() {
		return tobilloFlexionPlantarIzq;
	}
	public void setTobilloFlexionPlantarIzq(String tobilloFlexionPlantarIzq) {
		this.tobilloFlexionPlantarIzq = tobilloFlexionPlantarIzq;
	}
	public String getTobilloFlexionPlantarDer() {
		return tobilloFlexionPlantarDer;
	}
	public void setTobilloFlexionPlantarDer(String tobilloFlexionPlantarDer) {
		this.tobilloFlexionPlantarDer = tobilloFlexionPlantarDer;
	}
	public String getTobilloFlexionDorsalIzq() {
		return tobilloFlexionDorsalIzq;
	}
	public void setTobilloFlexionDorsalIzq(String tobilloFlexionDorsalIzq) {
		this.tobilloFlexionDorsalIzq = tobilloFlexionDorsalIzq;
	}
	public String getTobilloFlexionDorsalDer() {
		return tobilloFlexionDorsalDer;
	}
	public void setTobilloFlexionDorsalDer(String tobilloFlexionDorsalDer) {
		this.tobilloFlexionDorsalDer = tobilloFlexionDorsalDer;
	}
	
	
}
