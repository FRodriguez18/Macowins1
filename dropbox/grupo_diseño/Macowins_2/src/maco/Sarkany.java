package maco;

public class Sarkany implements Marca {

	@Override
	public Double coeficienteMarca(Prenda prenda)
	{
		Double precioTasa = prenda.precioConTasa();
		return precioTasa>500?1.35:1.10;
	}
	
}
