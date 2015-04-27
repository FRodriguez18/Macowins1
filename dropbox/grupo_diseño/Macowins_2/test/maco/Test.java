package maco;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main (String[] args)
	{
		Prenda.setValorFijo(25);
		
		Marca sarkany = new Sarkany();
		Marca armani = new Armani();
		
		Pantalon pant1 = new Pantalon(true,armani,85.2);
		Pantalon pant2 = new Pantalon(false, sarkany, 100.7);
		Camisa cam1 = new Camisa(true, sarkany);
		Camisa cam2 = new Camisa(false, armani);
		Saco saco1 = new Saco(true, armani, 4);
		Saco saco2 = new Saco(false, sarkany, 3);
		Zapatos zap1 = new Zapatos(true, sarkany,43);
		Zapatos zap2 = new Zapatos(false, armani, 37);
		Sombrero som1 = new Sombrero(true, armani, 63.7);
		Sombrero som2 = new Sombrero(false, sarkany, 11.7);
		
		Fecha fecha1 = new Fecha(10,11,2014);
		Fecha fecha2 = new Fecha(01,02,2015);
		
		Venta venta1 = new Venta(pant1,10,fecha1);
		Venta venta2 = new Venta(saco2,1,fecha1);
		Venta venta3 = new Venta(saco1,15,fecha2);
		Venta venta4 = new Venta(zap2,3,fecha1);
		Venta venta5 = new Venta(som1,7,fecha1);
		
		Negocio macowins = new Negocio();
		
		Collection<Venta> ventas = new ArrayList<Venta>();
		
		ventas.add(venta1);
		ventas.add(venta2);
		ventas.add(venta3);
		ventas.add(venta4);
		ventas.add(venta5);
		
		macowins.setVentas(ventas);
		
		System.out.println("El precio de " + pant1 + " es " + pant1.precioFinal() );
		System.out.println("El precio de " + pant2 + " es " + pant2.precioFinal() );
		System.out.println("El precio de " + saco1 + " es " + saco1.precioFinal() );
		System.out.println("El precio de " + saco2 + " es " + saco2.precioFinal() );
		System.out.println("El precio de " + cam1 + " es " + cam1.precioFinal() );
		System.out.println("El precio de " + cam2 + " es " + cam2.precioFinal() );
		System.out.println("El precio de " + zap1 + " es " + zap1.precioFinal() );
		System.out.println("El precio de " + zap2 + " es " + zap2.precioFinal() );
		System.out.println("El precio de " + som1 + " es " + som1.precioFinal() );
		System.out.println("El precio de " + som2 + " es " + som2.precioFinal() );
		
		System.out.println("Las ventas de " + fecha1 + " fueron " + macowins.ganancia(fecha1) );

		
	}
	
}
