package maco;

public class Armani implements Marca{

	@Override
	public double coeficienteMarca(Prenda prenda) {
		return prenda.precioTasa()*1.65;
	}

}
