package maco;

public class Pantalon extends Prenda {
		
    public Pantalon(boolean esImportada)
    {
        super(esImportada);
    }
    
    public String toString()
    {
        if (isImportada())
        {
        	return "Pantalon Importado";
        }
        else
        {
        	return "Pantalon Nacional";
        }
        
    }
     	    
    
	@Override
	public int precioBase()
	{
		return 250;
	}		

}
