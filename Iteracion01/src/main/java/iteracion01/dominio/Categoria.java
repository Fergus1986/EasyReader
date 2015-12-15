package iteracion01.dominio;

public class Categoria implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private String descripcion;
	
	public Categoria(){
		
	}
	
	public Categoria(String nombre){
		setNombre(nombre);
	}
	
	public Categoria(String nombre, String descripcion){
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public boolean equals(Object other){
		boolean comparison = false;
			
	    if (other == null) comparison = false;
	    if (other == this) comparison = true;
	    if (!(other instanceof Categoria)) comparison = false;
	    
	    Categoria otherMyClass = (Categoria)other;
	    if (otherMyClass.nombre.equals(this.getNombre()) ){
	    	comparison = true;
	    }
	    
	    return comparison;
	}
	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
