package maco;

public class Saco extends Prenda {
	
	private int cantidadBotones;
	
    public Saco(boolean esImportada, Marca marca,int cantidadBotones) 
    {
        super(esImportada,marca);
        this.cantidadBotones = cantidadBotones;
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
		return 300 + 10 * cantidadBotones;
	}

	public int getCantidadBotones() {
		return cantidadBotones;
	}

	public void setCantidadBotones(int cantidadBotones) {
		this.cantidadBotones = cantidadBotones;
	}
		

}
