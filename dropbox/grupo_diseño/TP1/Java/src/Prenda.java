
public class Prenda {
	private boolean esImportada;	
	private static int valorFijo;
		
	/*public int precioBase()
	{
		int precioBase = 0;
		return precioBase;
	}
	
	public int precioPrevio()
	{
		int precioPrevio=0;
		return precioPrevio;
	}*/
	
	public int precioFinal() //desarrollar
	{
		return 0; 
	}
	
	//getters y setters
	public boolean isEsImportada() {
		return esImportada;
	}
	public void setEsImportada(boolean esImportada) {
		this.esImportada = esImportada;
	}
	public static int getValorFijo() {
		return valorFijo;
	}
	public static void setValorFijo(int valorFijo) {
		Prenda.valorFijo = valorFijo;
	}
	
	
	

}
