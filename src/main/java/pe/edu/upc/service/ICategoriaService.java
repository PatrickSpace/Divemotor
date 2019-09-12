package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Categoria;

public interface ICategoriaService {
	public void insertar(Categoria categoria);
	public void eliminar(int IdCategoria);
	public void modificar(Categoria categoria);
	public List<Categoria> listararea();
}
