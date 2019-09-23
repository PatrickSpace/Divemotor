package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;

	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaSolicitud")
	private Date fechaSolicitud;

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaEntrega")
	private Date fechaEntrega;

	@ManyToOne
	@JoinColumn(name = "idEmpleado", nullable = false)
	private Empleado empleado;

	@ManyToOne
	@JoinColumn(name = "idPlanta", nullable = false)
	private Planta planta;

	@Column(name = "estado", nullable = false, length = 15)
	private String estado;

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int idPedido, Date fechaSolicitud, Date fechaEntrega, Empleado empleado, Planta planta,
			String estado) {
		super();
		this.idPedido = idPedido;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntrega = fechaEntrega;
		this.empleado = empleado;
		this.planta = planta;
		this.estado = estado;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Planta getPlanta() {
		return planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
