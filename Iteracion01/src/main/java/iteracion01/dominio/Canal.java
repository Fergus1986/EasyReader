package iteracion01.dominio;

public class Canal implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String titulo;
	private String enlace;
	private String url;
	private String descripcion;
	private Integer categoria;
	
	public Canal(){
		
	}
	
	public Canal(String titulo, String enlace, String url, String descripcion, Integer categoria){
		
		setTitulo(titulo);
		setEnlace(enlace);
		setUrl(url);
		setDescripcion(descripcion);
		setCategoria(categoria);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Canal [id=" + id + ", titulo=" + titulo + ", enlace=" + enlace + ", url=" + url + "]";
	}
}
