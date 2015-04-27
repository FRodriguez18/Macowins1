package maco;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import static org.mockito.Mockito.* -> con dependencia instalada

public class CamisaTestUno {
	
	private Prenda camisa;
	private Prenda camisaNacional;
	private MarcaMock marca;
	
	@Before
	public void setup()
	{
		Camisa.setValorFijo(50);
		marca = mock(Marca.class); //-> framework
		camisaNacional = new Camisa(false,marca);
	}
	
	@Test
	public void elPrecioFinalDeUnaCamisaImportadaEsElCorrecto()
	{
		MarcaMock marca = new MarcaMock(1.65);
		camisa = new Camisa(true, marca);
		assertEquals((Double) 536.25, camisa.precioFinal());
	}
	/*zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
	ZzZzZZZzZzZzZzZzZzZzZzZzZzZzZzZzZZzZzZzZzZzZzzzZzZzZzZzZzZzZzZzZZZZZZZzz
	*/
	
	@Test
	public void precioFinalDeUnaCamisaDaValorCorrecto()
	{
		//                       matcher
		when(marca.coeficiente(anyDouble())).thenReturn(1.0); //como se va a comportar cuando pase eso
		//						 eq(2)
		
		assertEquals((Double) 250.0, camisaNacional.precioFinal());
		//		 cantidad de veces
		verify(marca,times(1)).coeficiente(anyDouble()); //verifica si pidio la primera linea
		//			  never()
		//			  once ()
		
		/*JUnit -> framework -> 
		 * 		  				componentes
		 * 						inversion de control
		 * 						el framework me usa
		 * 						es estricto
		 * biblioteca -> 
		 * 				componentes 
		 * 				reutilizables
		 * 				yo uso a la biblioteca
		 * 				mas libertad
		 **/
		 
		
	}
}
