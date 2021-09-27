package mx.com.balanceneural.services.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RevisionFisica {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String ta;
     private String fc;
     private String fr;
     private String cambiosCutaneos;
     private String cicatrices;
     private String cambiosVasculares;
     private String dolorosos;
     private String triger;
     private String edema;
     private String insuficienciaVascular;
     private String otros;
     private String vol;
     private String veci;
     private String euforia;
     private String llanto;
     private String flush;
     private String interferencias;
     private String dental;
     
     private Date fecha= new Date();
     @ManyToOne
     private Paciente paciente;
     @ManyToOne
     private Doctor doctor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTa() {
		return ta;
	}
	public void setTa(String ta) {
		this.ta = ta;
	}
	public String getFc() {
		return fc;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}
	public String getCambiosCutaneos() {
		return cambiosCutaneos;
	}
	public void setCambiosCutaneos(String cambiosCutaneos) {
		this.cambiosCutaneos = cambiosCutaneos;
	}
	public String getCicatrices() {
		return cicatrices;
	}
	public void setCicatrices(String cicatrices) {
		this.cicatrices = cicatrices;
	}
	public String getCambiosVasculares() {
		return cambiosVasculares;
	}
	public void setCambiosVasculares(String cambiosVasculares) {
		this.cambiosVasculares = cambiosVasculares;
	}
	public String getDolorosos() {
		return dolorosos;
	}
	public void setDolorosos(String dolorosos) {
		this.dolorosos = dolorosos;
	}
	public String getTriger() {
		return triger;
	}
	public void setTrigger(String triger) {
		this.triger = triger;
	}
	public String getEdema() {
		return edema;
	}
	public void setEdema(String edema) {
		this.edema = edema;
	}
	public String getInsuficienciaVascular() {
		return insuficienciaVascular;
	}
	public void setInsuficienciaVascular(String insuficienciaVascular) {
		this.insuficienciaVascular = insuficienciaVascular;
	}
	public String getOtros() {
		return otros;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}
	public String getVol() {
		return vol;
	}
	public void setVol(String vol) {
		this.vol = vol;
	}
	public String getVeci() {
		return veci;
	}
	public void setVeci(String veci) {
		this.veci = veci;
	}
	public String getEuforia() {
		return euforia;
	}
	public void setEuforia(String euforia) {
		this.euforia = euforia;
	}
	public String getLlanto() {
		return llanto;
	}
	public void setLlanto(String llanto) {
		this.llanto = llanto;
	}
	public String getFlush() {
		return flush;
	}
	public void setFlush(String flush) {
		this.flush = flush;
	}
	public String getInterferencias() {
		return interferencias;
	}
	public void setInterferencias(String interferencias) {
		this.interferencias = interferencias;
	}
	public String getDental() {
		return dental;
	}
	public void setDental(String dental) {
		this.dental = dental;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
     
     
}
