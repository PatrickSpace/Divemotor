package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	
	@Column(name = "nombreCategoria", nullable = false, length = 30)
	private String nombreCategoria;
	
	@Column(name = "direccionPlanta", nullable = false, length = 50)
	private String direccionPlanta;

	public Categoria(int idCategoria, String nombreCategoria, String direccionPlanta) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
		this.direccionPlanta = direccionPlanta;
	}

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getDireccionPlanta() {
		return direccionPlanta;
	}

	public void setDireccionPlanta(String direccionPlanta) {
		this.direccionPlanta = direccionPlanta;
	}


	
}
