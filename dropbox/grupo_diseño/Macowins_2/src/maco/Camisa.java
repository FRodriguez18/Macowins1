package maco;

public class Camisa extends Prenda {
	
	
    public Camisa(boolean esImportada, Marca marca)
    {
        super(esImportada, marca);
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