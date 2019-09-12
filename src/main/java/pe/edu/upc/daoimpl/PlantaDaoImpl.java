package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPlantaDao;
import pe.edu.upc.entity.Planta;

public class PlantaDaoImpl implements IPlantaDao,Serializable{

	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "divemotor")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Planta planta) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void eliminar(int IdEliminar) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void modificar(Planta planta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Planta> listarplantas() {
		// TODO Auto-generated method stub
		return null;
	}

}
