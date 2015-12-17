package iteracion01.persistencia;

import iteracion01.persistencia.Agente;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import iteracion01.dominio.Canal;
import iteracion01.dominio.Categoria;

public class CanalDAO {
	
	private Session session;
	
	public CanalDAO(){
		setSession(Agente.getSessionFactory().openSession());
	}
	
	public Canal getCanal(int id){
		return getSession().get(Canal.class, id);
	}
	
	public Canal getCanal(String url){
		Criteria criteria = session.createCriteria(Canal.class);
		Canal canal = (Canal) criteria.add(Restrictions.eq("url", url)).uniqueResult();
		return canal;
	}
	
	@SuppressWarnings("unchecked")
	public List<Canal> getCanales(int idCategoria){
				
		Criteria criteria = session.createCriteria(Canal.class);
		List<Canal> canales = criteria.add(Restrictions.eq("categoria", idCategoria)).list();
		return canales;
	}
	
	public void save(Canal canal){
		getSession().beginTransaction();
		getSession().save(canal);
		getSession().getTransaction().commit();		
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
