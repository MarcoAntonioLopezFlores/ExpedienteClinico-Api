package mx.com.balanceneural.services.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table( uniqueConstraints = @UniqueConstraint(columnNames = "fileName"))
public class Documento {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private Date fecha= new Date();
	private String fileName;
    private String fileType;

    @Lob
    private byte[] data;
    
    @ManyToOne
    private Paciente paciente;

	public Long getId() {
		return id;
	}

	
	
	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
    
	
    
}
