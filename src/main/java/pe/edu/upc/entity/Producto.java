package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
	@Table(name = "Producto ")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	
	@Column(name = "NombreProducto", nullable = false, length = 50)
	private String nombreProducto;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria", nullable = false)
	private Categoria categoria;
	
	public Producto() {
		super();
		
	}
	

	public Producto(int idProducto, String nombreProducto, Categoria categoria, Marca marca, int stock) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.categoria = categoria;
		this.marca = marca;
		this.stock = stock;
	}


	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@ManyToOne
	@JoinColumn(name = "idMarca", nullable = false)
	private Marca marca;	
	
	@Column(name = "Stock", nullable = false, length = 20)
	private int stock;
	
	
	

}
