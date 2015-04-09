package maco;

import java.util.Collection;

public class Negocio {

	private Collection<Venta> ventas;
	
	public double ganancia (Fecha fecha)
	{
		double total=0;
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

	public Collection<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Collection<Venta> ventas) {
		this.ventas = ventas;
	}
	
}
