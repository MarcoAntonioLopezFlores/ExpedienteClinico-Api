package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Muneca {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String muñecaSupinacionIzq;
	private String muñecaSupinacionDer;
	private String muñecaPronacionIzq;
	private String muñecaPronacionDer;
	private String muñecaFlexionIzq;
	private String muñecaFlexionDer;
	private String muñecaExtensionIzq;
	private String muñecaExtensionDer;
	private String muñecaDesviacionRadialIzq;
	private String muñecaDesviacionRadialDer;
	private String muñecaDesviacionCubIzq;
	private String muñecaDesviacionCubDer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMuñecaSupinacionIzq() {
		return muñecaSupinacionIzq;
	}
	public void setMuñecaSupinacionIzq(String muñecaSupinacionIzq) {
		this.muñecaSupinacionIzq = muñecaSupinacionIzq;
	}
	public String getMuñecaSupinacionDer() {
		return muñecaSupinacionDer;
	}
	public void setMuñecaSupinacionDer(String muñecaSupinacionDer) {
		this.muñecaSupinacionDer = muñecaSupinacionDer;
	}
	public String getMuñecaPronacionIzq() {
		return muñecaPronacionIzq;
	}
	public void setMuñecaPronacionIzq(String muñecaPronacionIzq) {
		this.muñecaPronacionIzq = muñecaPronacionIzq;
	}
	public String getMuñecaPronacionDer() {
		return muñecaPronacionDer;
	}
	public void setMuñecaPronacionDer(String muñecaPronacionDer) {
		this.muñecaPronacionDer = muñecaPronacionDer;
	}
	public String getMuñecaFlexionIzq() {
		return muñecaFlexionIzq;
	}
	public void setMuñecaFlexionIzq(String muñecaFlexionIzq) {
		this.muñecaFlexionIzq = muñecaFlexionIzq;
	}
	public String getMuñecaFlexionDer() {
		return muñecaFlexionDer;
	}
	public void setMuñecaFlexionDer(String muñecaFlexionDer) {
		this.muñecaFlexionDer = muñecaFlexionDer;
	}
	public String getMuñecaExtensionIzq() {
		return muñecaExtensionIzq;
	}
	public void setMuñecaExtensionIzq(String muñecaExtensionIzq) {
		this.muñecaExtensionIzq = muñecaExtensionIzq;
	}
	public String getMuñecaExtensionDer() {
		return muñecaExtensionDer;
	}
	public void setMuñecaExtensionDer(String muñecaExtensionDer) {
		this.muñecaExtensionDer = muñecaExtensionDer;
	}
	public String getMuñecaDesviacionRadialIzq() {
		return muñecaDesviacionRadialIzq;
	}
	public void setMuñecaDesviacionRadialIzq(String muñecaDesviacionRadialIzq) {
		this.muñecaDesviacionRadialIzq = muñecaDesviacionRadialIzq;
	}
	public String getMuñecaDesviacionRadialDer() {
		return muñecaDesviacionRadialDer;
	}
	public void setMuñecaDesviacionRadialDer(String muñecaDesviacionRadialDer) {
		this.muñecaDesviacionRadialDer = muñecaDesviacionRadialDer;
	}
	public String getMuñecaDesviacionCubIzq() {
		return muñecaDesviacionCubIzq;
	}
	public void setMuñecaDesviacionCubIzq(String muñecaDesviacionCubIzq) {
		this.muñecaDesviacionCubIzq = muñecaDesviacionCubIzq;
	}
	public String getMuñecaDesviacionCubDer() {
		return muñecaDesviacionCubDer;
	}
	public void setMuñecaDesviacionCubDer(String muñecaDesviacionCubDer) {
		this.muñecaDesviacionCubDer = muñecaDesviacionCubDer;
	}
	
	

}
