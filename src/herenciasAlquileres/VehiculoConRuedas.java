package herenciasAlquileres;

public abstract class VehiculoConRuedas extends Vehiculo {

	protected int numeroRuedas;
	protected int puertas;
	protected int longitud;
	protected int ancho;
	
	
	
	public VehiculoConRuedas(String matricula, String marca, String modelo, String color, int motores , 
				int ancho, int largo, int ruedas, int puertas) {

		super(matricula,marca,modelo,color,motores);
		
		this.ancho = ancho;
		this.longitud = largo;
		this.numeroRuedas = ruedas;
		this.puertas = puertas;
		
	}
	
	
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	@Override
	public String toString() {
		return super.toString()+" VehiculoConRuedas [numeroRuedas=" + numeroRuedas + ", puertas=" + puertas + ", longitud=" + longitud
				+ ", ancho=" + ancho + "]";
	}
	
	
	@Override
	public abstract float calcularConsumo();
	
	
	

	
}
