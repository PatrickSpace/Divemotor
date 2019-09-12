package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Area;

public interface IAreaDao {
	public void insertar(Area area);
	public void eliminar(int areaId);
	public void modificar(Area area);
	public List<Area> listararea();
}
