package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Marca;

public interface IMarcaService {


	public void insertar(Marca marca);
	public void eliminar(int IdMarca);
	public void modificar(Marca marca);
	public List<Marca>listarmarcas();
}
