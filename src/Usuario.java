
public class Usuario {

// Campos de la clase
	private String nombre;
	@SuppressWarnings("unused")
	private String apellidoM;
	@SuppressWarnings("unused")
	private String apellidoP;
	private String iniciales;
	private int id;
// Constructor	
	public Usuario(){
	}
	
// Metodos getter	
	public String getNombre(){
		return nombre;
	}
	public String getApeelidoM(){
		return nombre;
	}
	public String getApellidoP(){
		return nombre;
	}
	public String getIniciales(){
		return iniciales;
	}
	public int Id(){
		return id;
	}
	
// Metodos setter:
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setApellidoM(String apellidoM){
		this.apellidoM = apellidoM;
	}
	public void setApellidoP(String apellidoP){
		this.apellidoP = apellidoP;
	}
	public void setIniciales(String iniciales){
		this.iniciales = iniciales;
	}
	public void setID(int id){
		this.id = id;		
	}
		
} // clase
