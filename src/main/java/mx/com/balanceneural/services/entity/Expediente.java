package mx.com.balanceneural.services.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table( uniqueConstraints = @UniqueConstraint(columnNames = "paciente_id"))
public class Expediente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	private Paciente paciente;
	@OneToOne(cascade = CascadeType.ALL)
	private Ficha ficha;
	
	
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
}
