package maco;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MarcaTest1 {
	private Marca sarkany;
	@Before
	public void setup()
	{
		sarkany = new Sarkany();
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrectoSiElPrecioEsMenorA500()
	{
		//Operaciones
		Double coeficiente = sarkany.coeficienteMarca(new Camisa(false,sarkany));
		//Postcondiciones
		assertEquals((Double) 1.1, coeficiente);	
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrectoSiElPrecioEsMayorA500()
	{
		//Operaciones
		Double coeficiente = sarkany.coeficienteMarca(new Sombrero(true,sarkany,3000));
		//Postcondiciones
		assertEquals((Double) 1.35, coeficiente);	
	}

}
