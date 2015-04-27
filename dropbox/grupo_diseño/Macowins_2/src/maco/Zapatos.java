package maco;

public class Zapatos extends Prenda {
	
	private int talle;
	
	
    public Zapatos(boolean esImportada, Marca marca, int talle) 
    {
        super(esImportada, marca);
        this.talle = talle;
    }
    
    public String toString()
    {
        if (isImportada())
        {
        	return "Zapatos Importados";
        }
        else
        {
        	return "Zapatos Nacionales";
        }
        
    }
	
    
	@Override
	public double precioBase()
	{
		return 400+5*talle;
	}

}