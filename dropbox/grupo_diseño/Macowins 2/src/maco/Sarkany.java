package maco;

public class Sarkany implements Marca{

	@Override
	public double coeficienteMarca(Prenda prenda) {
		double precio = prenda.precioTasa();
		if(precio>500)
		{
			return precio*1.35;
		}
		return precio*1.10;
	}

}
