package maco;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main (String[] args)
	{
		Prenda.setValorFijo(25);
		
		Pantalon pant1 = new Pantalon(true);
		Pantalon pant2 = new Pantalon(false);
		Camisa cam1 = new Camisa(true);
		Camisa cam2 = new Camisa(false);
		Saco saco1 = new Saco(true);
		Saco saco2 = new Saco(false);
		
		Fecha fecha1 = new Fecha(10,11,2014);
		Fecha fecha2 = new Fecha(11,12,2014);
		Fecha fecha3 = new Fecha(01,02,2015);
		
		Venta venta1 = new Venta(pant1,10,fecha1);
		Venta venta2 = new Venta(saco2,1,fecha1);
		Venta venta3 = new Venta(saco1,15,fecha3);
		
		Negocio macowins = new Negocio();
		
		Collection<Venta> ventas = new ArrayList<Venta>();
		
		ventas.add(venta1);
		ventas.add(venta2);
		ventas.add(venta3);
		
		macowins.setVentas(ventas);
		
		System.out.println("El precio de " + pant1 + " es " + pant1.precioFinal() );
		System.out.println("El precio de " + pant2 + " es " + pant2.precioFinal() );
		System.out.println("El precio de " + saco1 + " es " + saco1.precioFinal() );
		System.out.println("El precio de " + saco2 + " es " + saco2.precioFinal() );
		System.out.println("El precio de " + cam1 + " es " + cam1.precioFinal() );
		System.out.println("El precio de " + cam2 + " es " + cam2.precioFinal() );
		
		System.out.println("Las ventas de " + fecha1 + " fueron " + macowins.ganancia(fecha1) );

		
	}
	
}
