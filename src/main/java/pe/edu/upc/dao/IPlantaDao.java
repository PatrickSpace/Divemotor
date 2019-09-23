package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Planta;

public interface IPlantaDao {
	public void insertar(Planta planta);
	public void eliminar(int IdEliminar);
	public void modificar(Planta planta);
	public List<Planta> listarplantas();

}
