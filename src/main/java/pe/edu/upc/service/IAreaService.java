package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Area;

public interface IAreaService {
	public void insertar(Area area);
	public void eliminar(int areaId);
	public void modificar(Area area);
	public List<Area> listararea();
}
