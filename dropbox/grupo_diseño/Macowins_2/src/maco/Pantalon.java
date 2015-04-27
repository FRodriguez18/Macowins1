package maco;

public class Pantalon extends Prenda {
	
	private double cm2;
	
	
    public Pantalon(boolean esImportada, Marca marca, double cm2)
    {
        super(esImportada, marca);
        this.cm2 = cm2;
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
	public double precioBase()
	{
		return 250+cm2;
	}
		

}
