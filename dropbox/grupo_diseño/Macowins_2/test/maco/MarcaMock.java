package maco;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MarcaMock implements Marca {
	private Double coeficiente;
	
	public MarcaMock (Double coeficiente)
	{
		this.coeficiente = coeficiente;
	}
	
	@Override
	public Double coeficienteMarca(Prenda prenda) {
		
		return coeficiente;
	}
	
}
