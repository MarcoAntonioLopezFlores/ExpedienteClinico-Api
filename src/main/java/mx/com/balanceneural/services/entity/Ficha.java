package mx.com.balanceneural.services.entity;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Ficha {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String padeceAlgo;
	private String alergiaAnestesico;
	private String alergiaMedicamento;
	private String alergiaAlimento;
	private String transfusion;
	private String tienePlaca;

	@ManyToMany
	private List<Enfermedad> enfermedadesFamiliar = new ArrayList<Enfermedad>();
	@ManyToMany
	private List<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
	@ManyToMany
	private List<IntervencionQuirurgica> intervenciones= new ArrayList<IntervencionQuirurgica>();

	/*private String detalleLastTerapia;
	private String detalleNowTerapia;
	private String motivoConsulta;*/



	public List<Enfermedad> getEnfermedadesFamiliar() {
		return enfermedadesFamiliar;
	}
	public void setEnfermedadesFamiliar(List<Enfermedad> enfermedadesFamiliar) {
		this.enfermedadesFamiliar = enfermedadesFamiliar;
	}

	public String getTransfusion() {
		return transfusion;
	}
	public void setTransfusion(String transfusion) {
		this.transfusion = transfusion;
	}
	public String getAlergiaAnestesico() {
		return alergiaAnestesico;
	}
	public void setAlergiaAnestesico(String alergiaAnestesico) {
		this.alergiaAnestesico = alergiaAnestesico;
	}
	public String getAlergiaMedicamento() {
		return alergiaMedicamento;
	}
	public void setAlergiaMedicamento(String alergiaMedicamento) {
		this.alergiaMedicamento = alergiaMedicamento;
	}

	public String getTienePlaca() {
		return tienePlaca;
	}
	public void setTienePlaca(String tienePlaca) {
		this.tienePlaca = tienePlaca;
	}
	public String getAlergiaAlimento() {
		return alergiaAlimento;
	}
	public void setAlergiaAlimento(String alergiaAlimento) {
		this.alergiaAlimento = alergiaAlimento;
	}

	public Long getId() {
		return id;
	}
	public String getPadeceAlgo() {
		return padeceAlgo;
	}
	public void setPadeceAlgo(String padeceAlgo) {
		this.padeceAlgo = padeceAlgo;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}
	public List<IntervencionQuirurgica> getIntervenciones() {
		return intervenciones;
	}
	public void setIntervenciones(List<IntervencionQuirurgica> intervenciones) {
		this.intervenciones = intervenciones;
	}






}
