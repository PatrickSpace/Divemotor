






package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
@Table(name = "Empleados")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre", length = 80, nullable = false)
	private String nombre;

	@Column(name = "apellido", length = 80, nullable = false)
	private String apellido;

	@Column(name = "dni", length = 8, nullable = false)
	private String dni;
	@Column(name = "correo", length = 80, nullable = false)
	private String correo;

	@Column(name = "direccion", length = 120, nullable = false)
	private String direccion;

	@NotNull
	@Past(message = "No puedes seleccionar un dia que todavia no existe")
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaNac")
	private Date fechaNac;

	@Column(name = "telefono", length = 9, nullable = false)
	private String telefono;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "empleado")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "idCargo", nullable = false)
	private Cargo cargo;

	@ManyToOne
	@JoinColumn(name = "idArea", nullable = false)
	private Area area;

	public Empleado() {
		super();
	}

	public Empleado(int id, String nombre, String apellido, String dni, String correo, String direccion, Date fechaNac,
			String telefono, Usuario usuario, Cargo cargo, Area area) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		this.direccion = direccion;
		this.fechaNac = fechaNac;
		this.telefono = telefono;
		this.usuario = usuario;
		this.cargo = cargo;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}