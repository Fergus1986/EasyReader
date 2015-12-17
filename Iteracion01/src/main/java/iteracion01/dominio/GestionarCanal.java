package iteracion01.dominio;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.io.IOException;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import iteracion01.persistencia.CanalDAO;
import iteracion01.persistencia.CategoriaDAO;


public class GestionarCanal {
	
	private List<Categoria> categorias;
	
	public GestionarCanal(){
		
		loadCategorias();
	}
	
	public void addCanal(String url, String categoria) throws CanalException {
		
		URL feedUrl;
		SyndFeedInput input;
		SyndFeed feed;
		
		Canal canal;
		
		try {
			feedUrl = new URL(url);
			input = new SyndFeedInput();
			
			try {
				feed = input.build(new XmlReader(feedUrl));
				
				CanalDAO canalDAO = new CanalDAO();
				
				if (canalDAO.getCanal(url) == null){
					
					int index = getCategorias().indexOf(new Categoria(categoria));
					canal = new Canal(feed.getTitle(), feed.getLink(), url, feed.getDescription(), getCategorias().get(index).getId());
					canalDAO.save(canal);
					
				}else{
					
					throw new CanalException(CanalErrorCode.BAD_DUPLICATED);
				}
				
			} catch (IllegalArgumentException e) {
				
				throw new CanalException(CanalErrorCode.BAD_UNDEFINED);
				
			} catch (FeedException e) {
				
				throw new CanalException(CanalErrorCode.BAD_FEED);
				
			} catch (IOException e) {
				
				throw new CanalException(CanalErrorCode.BAD_UNDEFINED);
			}

		} catch (MalformedURLException e) {
			
			throw new CanalException(CanalErrorCode.BAD_URL);
		}
	}
	
	public void removeCanal(){
		
	}
	
	public void getCanal(String nombre){
		
	}
	
	public List<Canal> getCanales(int idCategoria){
		CanalDAO canalDAO = new CanalDAO();
		return canalDAO.getCanales(idCategoria);
	}
	
	public void loadCategorias(){
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		setCategorias(categoriaDAO.getCategorias());
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

}
