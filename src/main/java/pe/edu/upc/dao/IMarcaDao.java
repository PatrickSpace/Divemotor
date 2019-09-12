package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Marca;

public interface IMarcaDao {

	public void insertar(Marca marca);
	public void eliminar(int IdMarca);
	public void modificar(Marca marca);
	public List<Marca>listarmarcas();
}
