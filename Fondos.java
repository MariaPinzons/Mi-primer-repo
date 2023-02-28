public class Fondos extends Cliente
{
    private float plata;
	
	public Fondos(String id, String nombre, String apellido, int edad, float plata)
	{
		super(id, nombre, apellido, edad);
		this.plata = plata;
	}
 
        
  public void mostrarDatos()
	{
		System.out.println("ID Cliente: "+getId());
		System.out.println("Nombre Cliente: "+getNombre());
		System.out.println("Apellido Cliente: "+getApellido());
		System.out.println("Edad Cliente: "+getEdad());
		System.out.println("Dinero ingresado: $ "+plata);
	}
}