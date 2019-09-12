package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAreaDao;
import pe.edu.upc.entity.Area;

public class AreaDaoImpl implements IAreaDao,Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "divemotor")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Area area) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void eliminar(int areaId) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void modificar(Area area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Area> listararea() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
