package herenciasAlquileres;

public class Coche extends VehiculoConRuedas {

	private int volumenMaletero;

	
	
	public Coche(String matricula, String marca, String modelo, String color, int motores, 
				int ancho, int largo, int ruedas, int puertas, 
				int volumen) {

		super(	matricula,marca,modelo,color,motores,
				ancho,largo,ruedas,puertas); // constructor padre
		
		volumenMaletero = volumen;

	}

	public int getVolumenMaletero() {
		return volumenMaletero;
	}

	public void setVolumenMaletero(int volumenMaletero) {
		this.volumenMaletero = volumenMaletero;
	}

	@Override
	public String toString() {
		return super.toString()+" Coche [volumenMaletero=" + volumenMaletero + "]";
	}

	
	@Override
	public float calcularConsumo() {
		
		return 3*motores+0.23f*longitud*ancho;
	}
	
	
	
	
	
	
	
}
