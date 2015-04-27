package maco;

public abstract class Prenda {
	
	private static int valorFijo;
	private boolean importada;
	private Marca marca;
	
	public Prenda ()
	{
	         
	}
	     
	public Prenda (boolean esImportada,Marca marca)
	{
	    setImportada(esImportada);
	    this.marca = marca;
	}	
	
	public double precioFinal()
	{
		return precioTasa()*marca.coeficienteMarca(this);
	}
	
	public double precioTasa()
	{
		return precioBase() + valorFijo*tasaImportacion();
	}
	
	public double tasaImportacion ()
	{
		return importada?1.3:1;
	}
	
	protected abstract double precioBase();
	
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
