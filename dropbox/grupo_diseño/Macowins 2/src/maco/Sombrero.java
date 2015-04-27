package maco;

public class Sombrero extends Prenda {

	public double coeficienteMetrosexualidad;
	
    public Sombrero(boolean esImportada, Marca marca,double coeficienteMetrosexualidad)
    {
        super(esImportada,marca);
        this.coeficienteMetrosexualidad = coeficienteMetrosexualidad;
    }
	
	@Override
	protected double precioBase() {
		// TODO Auto-generated method stub
		return 150 + coeficienteMetrosexualidad;
	}

}
