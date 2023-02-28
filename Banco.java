public class Banco 
{
    public static void main(String[] args) 
	{
      Fondos dinero = new Fondos("2334545","Juan","Gomozo",34,179.10000f);
	  DineroFact f= new DineroFact();
	
      dinero.mostrarDatos();
      System.out.println("Cantidad de dinero total: "+f.facR(10f));//
    }
    
}