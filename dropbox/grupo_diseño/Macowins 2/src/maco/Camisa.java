package maco;

public class Camisa extends Prenda {
	
	
    public Camisa(boolean esImportada)
    {
        super(esImportada);
    }
    
    public String toString()
    {
        if (isImportada())
        {
        	return "Camisa Importada";
        }
        else
        {
        	return "Camisa Nacional";
        }
        
    }
 	
    
	@Override
	public double precioBase()
	{
		return 200;
	}
		

}