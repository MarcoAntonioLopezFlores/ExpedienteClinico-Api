package mx.com.balanceneural.services.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Odontograma {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String pieza18="Limpio";
	private String pieza17="Limpio";
	private String pieza16="Limpio";
	private String pieza15="Limpio";
	private String pieza14="Limpio";
	private String pieza13="Limpio";
	private String pieza12="Limpio";
	private String pieza11="Limpio";
	
	private String pieza48="Limpio";
	private String pieza47="Limpio";
	private String pieza46="Limpio";
	private String pieza45="Limpio";
	private String pieza44="Limpio";
	private String pieza43="Limpio";
	private String pieza42="Limpio";
	private String pieza41="Limpio";
	
	private String pieza21="Limpio";
	private String pieza22="Limpio";
	private String pieza23="Limpio";
	private String pieza24="Limpio";
	private String pieza25="Limpio";
	private String pieza26="Limpio";
	private String pieza27="Limpio";
	private String pieza28="Limpio";
	
	private String pieza31="Limpio";
	private String pieza32="Limpio";
	private String pieza33="Limpio";
	private String pieza34="Limpio";
	private String pieza35="Limpio";
	private String pieza36="Limpio";
	private String pieza37="Limpio";
	private String pieza38="Limpio";
	
	private String detalleGeneral;
	
	private Date fecha = new Date();
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
		public String getPieza18() {
			return pieza18;
		}
		public void setPieza18(String pieza18) {
			this.pieza18 = pieza18;
		}
		public String getPieza17() {
			return pieza17;
		}
		public void setPieza17(String pieza17) {
			this.pieza17 = pieza17;
		}
		public String getPieza16() {
			return pieza16;
		}
		public void setPieza16(String pieza16) {
			this.pieza16 = pieza16;
		}
		public String getPieza15() {
			return pieza15;
		}
		public void setPieza15(String pieza15) {
			this.pieza15 = pieza15;
		}
		public String getPieza14() {
			return pieza14;
		}
		public void setPieza14(String pieza14) {
			this.pieza14 = pieza14;
		}
		public String getPieza13() {
			return pieza13;
		}
		public void setPieza13(String pieza13) {
			this.pieza13 = pieza13;
		}
		public String getPieza12() {
			return pieza12;
		}
		public void setPieza12(String pieza12) {
			this.pieza12 = pieza12;
		}
		public String getPieza11() {
			return pieza11;
		}
		public void setPieza11(String pieza11) {
			this.pieza11 = pieza11;
		}
		public String getPieza48() {
			return pieza48;
		}
		public void setPieza48(String pieza48) {
			this.pieza48 = pieza48;
		}
		public String getPieza47() {
			return pieza47;
		}
		public void setPieza47(String pieza47) {
			this.pieza47 = pieza47;
		}
		public String getPieza46() {
			return pieza46;
		}
		public void setPieza46(String pieza46) {
			this.pieza46 = pieza46;
		}
		public String getPieza45() {
			return pieza45;
		}
		public void setPieza45(String pieza45) {
			this.pieza45 = pieza45;
		}
		public String getPieza44() {
			return pieza44;
		}
		public void setPieza44(String pieza44) {
			this.pieza44 = pieza44;
		}
		public String getPieza43() {
			return pieza43;
		}
		public void setPieza43(String pieza43) {
			this.pieza43 = pieza43;
		}
		public String getPieza42() {
			return pieza42;
		}
		public void setPieza42(String pieza42) {
			this.pieza42 = pieza42;
		}
		public String getPieza41() {
			return pieza41;
		}
		public void setPieza41(String pieza41) {
			this.pieza41 = pieza41;
		}
		public String getPieza21() {
			return pieza21;
		}
		public void setPieza21(String pieza21) {
			this.pieza21 = pieza21;
		}
		public String getPieza22() {
			return pieza22;
		}
		public void setPieza22(String pieza22) {
			this.pieza22 = pieza22;
		}
		public String getPieza23() {
			return pieza23;
		}
		public void setPieza23(String pieza23) {
			this.pieza23 = pieza23;
		}
		public String getPieza24() {
			return pieza24;
		}
		public void setPieza24(String pieza24) {
			this.pieza24 = pieza24;
		}
		public String getPieza25() {
			return pieza25;
		}
		public void setPieza25(String pieza25) {
			this.pieza25 = pieza25;
		}
		public String getPieza26() {
			return pieza26;
		}
		public void setPieza26(String pieza26) {
			this.pieza26 = pieza26;
		}
		public String getPieza27() {
			return pieza27;
		}
		public void setPieza27(String pieza27) {
			this.pieza27 = pieza27;
		}
		public String getPieza28() {
			return pieza28;
		}
		public void setPieza28(String pieza28) {
			this.pieza28 = pieza28;
		}
		public String getPieza31() {
			return pieza31;
		}
		public void setPieza31(String pieza31) {
			this.pieza31 = pieza31;
		}
		public String getPieza32() {
			return pieza32;
		}
		public void setPieza32(String pieza32) {
			this.pieza32 = pieza32;
		}
		public String getPieza33() {
			return pieza33;
		}
		public void setPieza33(String pieza33) {
			this.pieza33 = pieza33;
		}
		public String getPieza34() {
			return pieza34;
		}
		public void setPieza34(String pieza34) {
			this.pieza34 = pieza34;
		}
		public String getPieza35() {
			return pieza35;
		}
		public void setPieza35(String pieza35) {
			this.pieza35 = pieza35;
		}
		public String getPieza36() {
			return pieza36;
		}
		public void setPieza36(String pieza36) {
			this.pieza36 = pieza36;
		}
		public String getPieza37() {
			return pieza37;
		}
		public void setPieza37(String pieza37) {
			this.pieza37 = pieza37;
		}
		public String getPieza38() {
			return pieza38;
		}
		public void setPieza38(String pieza38) {
			this.pieza38 = pieza38;
		}
		public String getDetalleGeneral() {
			return detalleGeneral;
		}
		public void setDetalleGeneral(String detalleGeneral) {
			this.detalleGeneral = detalleGeneral;
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
