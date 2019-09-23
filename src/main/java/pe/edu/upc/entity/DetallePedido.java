package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DetallePedido")
public class DetallePedido implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalle;
	
	@Column(name = "cantidad", nullable = false, length = 6)
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "idPedido", nullable = false)
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "idProducto", nullable = false)
	private Producto producto;

	public DetallePedido() {
		super();
			}

	public DetallePedido(int idDetalle, int cantidad, Pedido pedido, Producto producto) {
		super();
		this.idDetalle = idDetalle;
		this.cantidad = cantidad;
		this.pedido = pedido;
		this.producto = producto;
	}

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
