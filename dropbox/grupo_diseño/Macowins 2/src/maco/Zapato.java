package maco;

public class Zapato extends Prenda {

	private double talle;

    public Zapato(boolean esImportada, Marca marca,double talle)
    {
        super(esImportada,marca);
        this.talle = talle;
    }
	
	@Override
	protected double precioBase() {
		// TODO Auto-generated method stub
		return 400 + 5*talle;
	}


	public double getTalle() {
		return talle;
	}


	public void setTalle(double talle) {
		this.talle = talle;
	}

}
