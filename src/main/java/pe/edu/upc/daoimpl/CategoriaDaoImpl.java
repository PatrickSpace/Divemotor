package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICategoriaDao;
import pe.edu.upc.entity.Categoria;

public class CategoriaDaoImpl implements ICategoriaDao,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "divemotor")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void eliminar(int IdCategoria) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void modificar(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categoria> listararea() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
