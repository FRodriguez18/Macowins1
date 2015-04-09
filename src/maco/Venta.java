package maco;

public class Venta {
	
	private Prenda prendaVendida;
	private int cantVendida;
	private Fecha fechaVenta;
	
	public Venta()
	{
		
	}
	
	public Venta(Prenda prenda, int cantidad, Fecha fecha)
	{
		setPrendaVendida(prenda);
		setCantVendida(cantidad);
		setFechaVenta(fecha);
	}
	
	public double precioTotal()
	{
		Prenda prenda = this.prendaVendida;
		double total = prenda.precioFinal() * this.cantVendida;
		return total;
	}
	
	public int getCantVendida() {
		return cantVendida;
	}
	public void setCantVendida(int cantVendida) {
		this.cantVendida = cantVendida;
	}
	public Fecha getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Fecha fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Prenda getPrendaVendida() {
		return prendaVendida;
	}
	public void setPrendaVendida(Prenda prendaVendida) {
		this.prendaVendida = prendaVendida;
	}

}
