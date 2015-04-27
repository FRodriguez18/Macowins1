package maco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test2FedeYLuchoGomas {
	private Marca armani;
	
	@Before
	public void setup()
	{
		armani = new Armani();
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrectoSiElPrecioEsMenorA500()
	{
		//Operaciones
		Double coeficiente = armani.coeficienteMarca(new Camisa(false,armani));
		//Postcondiciones
		assertEquals((Double) 1.65, coeficiente);	
	}
	

}
