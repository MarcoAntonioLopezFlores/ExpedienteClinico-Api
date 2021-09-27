package mx.com.balanceneural.services.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cuestionario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String motivo;
	private String recibioTerapia;
	private String tieneTratamiento;
	private String dolorUltimamente;
	private String frecuenciaDolor;
	private String duracionDolor;
	private String recibioTratamiento;
	private String tratamientoRecibido;
	private String mejoroTratamiento;
	private String afectarCalidad;
	private String dejarActividad;
	private String dejarTrabajo;
	private String dolorFuerteEn;
	private String empeoraConActividad;
	private String dolorCon;
	private String mejoraConReposo;
	private String calDolor;
	private String problemasDormir;
	private String problemasEvacuar;
	private String origenDolor;
	private String triste;
	private String medicamentoAdverso;
	private String perderInteres;
	private String trabajoConcentrarse;
	private String apoyoCercano;
	private String tieneDolorHoy;
	private int numeroDolor;
	private String padecimientos;
	private Date fecha= new Date();

	@ManyToOne
    private Paciente paciente;


	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getMedicamentoAdverso() {
		return medicamentoAdverso;
	}
	public void setMedicamentoAdverso(String medicamentoAdverso) {
		this.medicamentoAdverso = medicamentoAdverso;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMotivo() {
		return motivo;
	}
	public String getPadecimientos() {
		return padecimientos;
	}
	public void setPadecimientos(String padecimientos) {
		this.padecimientos = padecimientos;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getRecibioTerapia() {
		return recibioTerapia;
	}
	public void setRecibioTerapia(String recibioTerapia) {
		this.recibioTerapia = recibioTerapia;
	}
	public String getTieneTratamiento() {
		return tieneTratamiento;
	}
	public void setTieneTratamiento(String tieneTratamiento) {
		this.tieneTratamiento = tieneTratamiento;
	}
	public String getDolorUltimamente() {
		return dolorUltimamente;
	}
	public void setDolorUltimamente(String dolorUltimamente) {
		this.dolorUltimamente = dolorUltimamente;
	}
	public String getFrecuenciaDolor() {
		return frecuenciaDolor;
	}
	public void setFrecuenciaDolor(String frecuenciaDolor) {
		this.frecuenciaDolor = frecuenciaDolor;
	}
	public String getDuracionDolor() {
		return duracionDolor;
	}
	public void setDuracionDolor(String duracionDolor) {
		this.duracionDolor = duracionDolor;
	}
	public String getRecibioTratamiento() {
		return recibioTratamiento;
	}
	public void setRecibioTratamiento(String recibioTratamiento) {
		this.recibioTratamiento = recibioTratamiento;
	}
	public String getTratamientoRecibido() {
		return tratamientoRecibido;
	}
	public void setTratamientoRecibido(String tratamientoRecibido) {
		this.tratamientoRecibido = tratamientoRecibido;
	}
	public String getMejoroTratamiento() {
		return mejoroTratamiento;
	}
	public void setMejoroTratamiento(String mejoroTratamiento) {
		this.mejoroTratamiento = mejoroTratamiento;
	}
	public String getAfectarCalidad() {
		return afectarCalidad;
	}
	public void setAfectarCalidad(String afectarCalidad) {
		this.afectarCalidad = afectarCalidad;
	}
	public String getDejarActividad() {
		return dejarActividad;
	}
	public void setDejarActividad(String dejarActividad) {
		this.dejarActividad = dejarActividad;
	}
	public String getDejarTrabajo() {
		return dejarTrabajo;
	}
	public void setDejarTrabajo(String dejarTrabajo) {
		this.dejarTrabajo = dejarTrabajo;
	}
	public String getDolorFuerteEn() {
		return dolorFuerteEn;
	}
	public void setDolorFuerteEn(String dolorFuerteEn) {
		this.dolorFuerteEn = dolorFuerteEn;
	}
	public String getEmpeoraConActividad() {
		return empeoraConActividad;
	}
	public void setEmpeoraConActividad(String empeoraConActividad) {
		this.empeoraConActividad = empeoraConActividad;
	}
	public String getDolorCon() {
		return dolorCon;
	}
	public void setDolorCon(String dolorCon) {
		this.dolorCon = dolorCon;
	}
	public String getMejoraConReposo() {
		return mejoraConReposo;
	}
	public void setMejoraConReposo(String mejoraConReposo) {
		this.mejoraConReposo = mejoraConReposo;
	}
	public String getCalDolor() {
		return calDolor;
	}
	public void setCalDolor(String calDolor) {
		this.calDolor = calDolor;
	}
	public String getProblemasDormir() {
		return problemasDormir;
	}
	public void setProblemasDormir(String problemasDormir) {
		this.problemasDormir = problemasDormir;
	}
	public String getProblemasEvacuar() {
		return problemasEvacuar;
	}
	public void setProblemasEvacuar(String problemasEvacuar) {
		this.problemasEvacuar = problemasEvacuar;
	}
	public String getOrigenDolor() {
		return origenDolor;
	}
	public void setOrigenDolor(String origenDolor) {
		this.origenDolor = origenDolor;
	}
	public String getTriste() {
		return triste;
	}
	public void setTriste(String triste) {
		this.triste = triste;
	}
	public String getPerderInteres() {
		return perderInteres;
	}
	public void setPerderInteres(String perderInteres) {
		this.perderInteres = perderInteres;
	}
	public String getTrabajoConcentrarse() {
		return trabajoConcentrarse;
	}
	public void setTrabajoConcentrarse(String trabajoConcentrarse) {
		this.trabajoConcentrarse = trabajoConcentrarse;
	}
	public String getApoyoCercano() {
		return apoyoCercano;
	}
	public void setApoyoCercano(String apoyoCercano) {
		this.apoyoCercano = apoyoCercano;
	}
	public String getTieneDolorHoy() {
		return tieneDolorHoy;
	}
	public void setTieneDolorHoy(String tieneDolorHoy) {
		this.tieneDolorHoy = tieneDolorHoy;
	}
	public int getNumeroDolor() {
		return numeroDolor;
	}
	public void setNumeroDolor(int numeroDolor) {
		this.numeroDolor = numeroDolor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
