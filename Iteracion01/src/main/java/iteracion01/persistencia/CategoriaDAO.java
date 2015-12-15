package iteracion01.persistencia;

import iteracion01.persistencia.Agente;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import iteracion01.dominio.Categoria;


public class CategoriaDAO {
	
	private Session session;
	
	public CategoriaDAO(){
		setSession(Agente.getSessionFactory().openSession());
	}
	
	public Categoria getCategoria(int id){
		return getSession().get(Categoria.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias(){
		Criteria criteria = getSession().createCriteria(Categoria.class);
		List<Categoria> categorias = criteria.list();
		return categorias;
	}
	
	public void save(Categoria categoria){
		getSession().beginTransaction();
		getSession().save(categoria);
		getSession().getTransaction().commit();	
	}
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}


}
