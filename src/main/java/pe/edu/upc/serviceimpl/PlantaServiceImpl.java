package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPlantaDao;
import pe.edu.upc.entity.Planta;
import pe.edu.upc.service.IPlantaService;

@Named
@RequestScoped
public class PlantaServiceImpl implements IPlantaService{

	@Inject
	private IPlantaDao pD;

	@Override
	public void insertar(Planta planta) {
		try
		{
			pD.insertar(planta);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void eliminar(int IdEliminar) {
		try
		{
			pD.eliminar(IdEliminar);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void modificar(Planta planta) {
		try
		{
			pD.modificar(planta);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Planta> listarplantas() {
		return pD.listarplantas();
	}
}
