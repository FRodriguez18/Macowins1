package maco;

public class Saco extends Prenda {
	
	
    public Saco(boolean esImportada) 
    {
        super(esImportada);
    }
    
    public String toString()
    {
        if (this.isImportada() )
        {
        	return "Saco Importado";
        }
        else
        {
        	return "Saco Nacional";
        }
        
    }
	
    
	@Override
	public int precioBase()
	{
		return 300;
	}
		

}
