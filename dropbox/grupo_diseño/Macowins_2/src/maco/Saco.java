package maco;

public class Saco extends Prenda {
	
	private int cantBotones;
	
	
    public Saco(boolean esImportada, Marca marca, int cantBotones) 
    {
        super(esImportada, marca);
        this.cantBotones = cantBotones;
    }
    
    public String toString()
    {
        if (isImportada())
        {
        	return "Saco Importado";
        }
        else
        {
        	return "Saco Nacional";
        }
        
    }
	
    
	@Override
	public double precioBase()
	{
		return 300+10*cantBotones;
	}
		

}
