package iteracion01.persistencia;

import iteracion01.persistencia.Agente;

import org.hibernate.Session;

import iteracion01.dominio.Canal;

public class CanalDAO {
	
	private Session session;
	
	public CanalDAO(){
		setSession(Agente.getSessionFactory().openSession());
	}
	
	public Canal getCanal(int id){
		return getSession().get(Canal.class, id);
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