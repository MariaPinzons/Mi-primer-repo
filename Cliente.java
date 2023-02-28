public class Cliente 
{
    /*protected*/private String id;
	/*protected*/private String nombre;
	/*protected*/private String apellido;
	/*protected*/private int edad;
	
	public Cliente(String id, String nombre, String apellido, int edad)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
    }
	
	public String getId()
	{
		return id;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public int getEdad()
	{
		return edad;
	}
}