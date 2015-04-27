package maco;

public abstract class Prenda {
	
	private static int valorFijo;
	private boolean importada;
	
	
	public Prenda ()
	{
	         
	}
	     
	public Prenda (boolean esImportada)
	{
	    setImportada(esImportada);
	}	
	
	public double precioFinal()
	{
		double retorno = (precioBase() + valorFijo)*tasaImportacion();
		return retorno;
	}
	
	public double tasaImportacion ()
	{
		return importada?1.3:1;
	}
	
	protected abstract int precioBase();
	
	public static int getValorFijo() {
		return valorFijo;
	}
	
	public static void setValorFijo(int valorFijo) {
		Prenda.valorFijo = valorFijo;
	}
	
	public boolean isImportada() {
		return importada;
	}
	
	public void setImportada(boolean importada) {
		this.importada = importada;
	}
	
}
