package maco;

import java.util.Collection;

public class Negocio {

	private Collection<Venta> ventas;
	
	public double ganancia (Fecha fecha)
	{
		double total = 0;
		
		//ventas.forEach(v -> sumaParcial(v,total)); no funca porque no cambia el valor de total
		
		for(Venta venta:ventas)
		{
			Fecha fechaVenta = venta.getFechaVenta();
			if(fechaVenta.equals(fecha))
			{
			total += venta.precioTotal();
			}
		}
		return total;
	}
	
	/*private double sumaParcial(Venta venta, double suma)
	{
		return venta.precioTotal() + suma;
	}*/

	public Collection<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Collection<Venta> ventas) {
		this.ventas = ventas;
	}
	
}
