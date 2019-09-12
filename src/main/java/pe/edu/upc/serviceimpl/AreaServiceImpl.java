package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAreaDao;
import pe.edu.upc.entity.Area;
import pe.edu.upc.service.IAreaService;

@Named
@RequestScoped
public class AreaServiceImpl implements IAreaService {

	@Inject
	private IAreaDao aD;
	
	@Override
	public void insertar(Area area) {
		try
		{
			aD.insertar(area);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void eliminar(int areaId) {
		try
		{
			aD.eliminar(areaId);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void modificar(Area area) {
		try
		{
			aD.modificar(area);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Area> listararea() {
		return aD.listararea();
	}

}
