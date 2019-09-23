package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMarcaDao;
import pe.edu.upc.entity.Marca;

public class MarcaDaoImpl implements IMarcaDao,Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "divemotor")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Marca marca) {
		try
		{
			em.persist(marca);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional
	@Override
	public void eliminar(int IdMarca) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	@Override
	public void modificar(Marca marca) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public List<Marca> listarmarcas() {
		// TODO Auto-generated method stub
		return null;
	}

}
