package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entity.Marca;
import pe.edu.upc.service.IMarcaService;

@Named
@RequestScoped
public class MarcaServiceImpl implements IMarcaService {

	@Inject
	private IMarcaDao mD;

	@Override
	public void insertar(Marca marca) {
		try
		{
			mD.insertar(marca);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void eliminar(int IdMarca) {
		try
		{
			mD.eliminar(IdMarca);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void modificar(Marca marca) {
		try
		{
			mD.modificar(marca);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Marca> listarmarcas() {
		
		return mD.listarmarcas();
	}
}
