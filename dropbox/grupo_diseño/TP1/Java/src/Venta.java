
public class Venta { //esta clase esta terminada
	private Prenda prenda;
	private int cantidad;
	private Fecha fecha;
	
	public Venta (Prenda prenda, int cantidad, Fecha fecha) //idem fecha
	{
		setPrenda(prenda);
		setCantidad(cantidad);
		setFecha(fecha);
	}
	
	public int precioTotal()
	{
		return prenda.precioFinal()*cantidad;
	}
	
	
	//getters y setters
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	
}
