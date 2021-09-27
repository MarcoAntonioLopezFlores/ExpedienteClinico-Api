package mx.com.balanceneural.services.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CuestionarioAcupuntura {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String nombresZona;
	private String detalle1;
	private String detalle2;
	private String detalle3;
	private String detalle4;
	private String detalle5;
	private String detalle6;
	private String observaciones;
	private String cr;
    private String ide;
    private String pl;
    private String ig;
    private String hg;
    private String vb;
    private String bp;
    private String es;
    private String rñ;
    private String vj;
    private String pc;
    private String sj;
    private String densidad;
    private String grosor;
    private String velocidad;
    private String textura;
    private String longitud;
    private String impresionPulso;
    private String tratamientoGeneral;

	
	
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
	public String getNombresZona() {
		return nombresZona;
	}
	
	public void setNombresZona(String nombresZona) {
		this.nombresZona = nombresZona;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	public String getDetalle1() {
		return detalle1;
	}
	public void setDetalle1(String detalle1) {
		this.detalle1 = detalle1;
	}
	public String getDetalle2() {
		return detalle2;
	}
	public void setDetalle2(String detalle2) {
		this.detalle2 = detalle2;
	}
	public String getDetalle3() {
		return detalle3;
	}
	public void setDetalle3(String detalle3) {
		this.detalle3 = detalle3;
	}
	public String getDetalle4() {
		return detalle4;
	}
	public void setDetalle4(String detalle4) {
		this.detalle4 = detalle4;
	}
	public String getDetalle5() {
		return detalle5;
	}
	public void setDetalle5(String detalle5) {
		this.detalle5 = detalle5;
	}
	public String getDetalle6() {
		return detalle6;
	}
	public void setDetalle6(String detalle6) {
		this.detalle6 = detalle6;
	}
	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	public String getPl() {
		return pl;
	}
	public void setPl(String pl) {
		this.pl = pl;
	}
	public String getIg() {
		return ig;
	}
	public void setIg(String ig) {
		this.ig = ig;
	}
	public String getHg() {
		return hg;
	}
	public void setHg(String hg) {
		this.hg = hg;
	}
	public String getVb() {
		return vb;
	}
	public void setVb(String vb) {
		this.vb = vb;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	public String getEs() {
		return es;
	}
	public void setEs(String es) {
		this.es = es;
	}
	public String getRñ() {
		return rñ;
	}
	public void setRñ(String rñ) {
		this.rñ = rñ;
	}
	public String getVj() {
		return vj;
	}
	public void setVj(String vj) {
		this.vj = vj;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public String getSj() {
		return sj;
	}
	public void setSj(String sj) {
		this.sj = sj;
	}
	public String getDensidad() {
		return densidad;
	}
	public void setDensidad(String densidad) {
		this.densidad = densidad;
	}
	public String getGrosor() {
		return grosor;
	}
	public void setGrosor(String grosor) {
		this.grosor = grosor;
	}
	public String getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	public String getTextura() {
		return textura;
	}
	public void setTextura(String textura) {
		this.textura = textura;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getImpresionPulso() {
		return impresionPulso;
	}
	public void setImpresionPulso(String impresionPulso) {
		this.impresionPulso = impresionPulso;
	}
	public String getTratamientoGeneral() {
		return tratamientoGeneral;
	}
	public void setTratamientoGeneral(String tratamientoGeneral) {
		this.tratamientoGeneral = tratamientoGeneral;
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
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
    
    
    
}
