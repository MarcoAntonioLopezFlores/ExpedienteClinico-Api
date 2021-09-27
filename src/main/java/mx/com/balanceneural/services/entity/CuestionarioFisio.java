package mx.com.balanceneural.services.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CuestionarioFisio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String regionPrincipal; 
	private String espamo;
	private String escalaDaniels;
	@OneToOne(cascade = CascadeType.ALL)
	private Raquis raquis;
	@OneToOne(cascade = CascadeType.ALL)
	private RaquisDorso raquisDorso;
	@OneToOne(cascade = CascadeType.ALL)
	private Hombro hombro;
	@OneToOne(cascade = CascadeType.ALL)
	private Cadera cadera;
	@OneToOne(cascade = CascadeType.ALL)
	private Rodilla rodilla;
	@OneToOne(cascade = CascadeType.ALL)
	private Codo codo;
	@OneToOne(cascade = CascadeType.ALL)
	private Muneca muñeca;
	@OneToOne(cascade = CascadeType.ALL)
	private Tobillo tobillo;
	
	private String marchaLibre;
	private String marchaAntialgica;
	private String claudicante;
	private String conAyuda;
	private String espastica;
	private String ataxica;
	private int nivelDolor;
	
	private Date fecha= new Date();
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Doctor doctor;

	public Raquis getRaquis() {
		return raquis;
	}



	
	
	public Date getFecha() {
		return fecha;
	}





	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}





	public Doctor getDoctor() {
		return doctor;
	}





	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}





	public void setRaquis(Raquis raquis) {
		this.raquis = raquis;
	}



	public RaquisDorso getRaquisDorso() {
		return raquisDorso;
	}



	public void setRaquisDorso(RaquisDorso raquisDorso) {
		this.raquisDorso = raquisDorso;
	}



	public Hombro getHombro() {
		return hombro;
	}



	public void setHombro(Hombro hombro) {
		this.hombro = hombro;
	}



	public Cadera getCadera() {
		return cadera;
	}



	public void setCadera(Cadera cadera) {
		this.cadera = cadera;
	}



	public Rodilla getRodilla() {
		return rodilla;
	}



	public void setRodilla(Rodilla rodilla) {
		this.rodilla = rodilla;
	}



	public Codo getCodo() {
		return codo;
	}



	public void setCodo(Codo codo) {
		this.codo = codo;
	}



	public Muneca getMuñeca() {
		return muñeca;
	}



	public void setMuñeca(Muneca muñeca) {
		this.muñeca = muñeca;
	}



	public Tobillo getTobillo() {
		return tobillo;
	}



	public void setTobillo(Tobillo tobillo) {
		this.tobillo = tobillo;
	}



	public String getMarchaLibre() {
		return marchaLibre;
	}



	public void setMarchaLibre(String marchaLibre) {
		this.marchaLibre = marchaLibre;
	}



	public String getMarchaAntialgica() {
		return marchaAntialgica;
	}



	public void setMarchaAntialgica(String marchaAntialgica) {
		this.marchaAntialgica = marchaAntialgica;
	}



	public String getClaudicante() {
		return claudicante;
	}



	public void setClaudicante(String claudicante) {
		this.claudicante = claudicante;
	}



	public String getConAyuda() {
		return conAyuda;
	}



	public void setConAyuda(String conAyuda) {
		this.conAyuda = conAyuda;
	}



	public String getEspastica() {
		return espastica;
	}



	public void setEspastica(String espastica) {
		this.espastica = espastica;
	}



	public String getAtaxica() {
		return ataxica;
	}



	public void setAtaxica(String ataxica) {
		this.ataxica = ataxica;
	}



	public int getNivelDolor() {
		return nivelDolor;
	}



	public void setNivelDolor(int nivelDolor) {
		this.nivelDolor = nivelDolor;
	}



	public Long getId() {
		return id;
	}
	
	

	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getRegionPrincipal() {
		return regionPrincipal;
	}

	public void setRegionPrincipal(String regionPrincipal) {
		this.regionPrincipal = regionPrincipal;
	}

	public String getEspamo() {
		return espamo;
	}

	public void setEspamo(String espamo) {
		this.espamo = espamo;
	}

	public String getEscalaDaniels() {
		return escalaDaniels;
	}

	public void setEscalaDaniels(String escalaDaniels) {
		this.escalaDaniels = escalaDaniels;
	}

	


}
