package maco;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.*;


public class Negocio {

	private Collection<Venta> ventas;
	
	public double ganancia (Fecha fecha)
	{
		List<Venta> ventasFiltradas = ventas.stream().filter( venta -> (venta.getFechaVenta()).equals(fecha) ).collect(Collectors.toList());
		double total =  ventasFiltradas.stream().mapToDouble(Venta::precioTotal).sum();		
 
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
