package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Planta;

public interface IPlantaService {

	public void insertar(Planta planta);
	public void eliminar(int IdEliminar);
	public void modificar(Planta planta);
	public List<Planta> listarplantas();
}
