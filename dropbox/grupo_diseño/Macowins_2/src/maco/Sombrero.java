package maco;

public class Sombrero extends Prenda {
	
	private double coefMetrosexualidad;
	
	
    public Sombrero(boolean esImportada, Marca marca, double coefMetrosexualidad) 
    {
        super(esImportada, marca);
        this.coefMetrosexualidad = coefMetrosexualidad;
    }
    
    public String toString()
    {
        if (isImportada())
        {
        	return "Sombrero Importado";
        }
        else
        {
        	return "Sombrero Nacional";
        }
        
    }
	
    
	@Override
	public double precioBase()
	{
		return 150+coefMetrosexualidad;
	}

}
