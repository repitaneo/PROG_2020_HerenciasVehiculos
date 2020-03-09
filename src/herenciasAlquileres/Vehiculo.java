package herenciasAlquileres;

public abstract class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected int motores;
	
	
	public Vehiculo(String matricula, String marca, String modelo, String color, int motores) {

		this.matricula = matricula;
		this.marca= marca;
		this.modelo =modelo;
		this.color=color;
		this.motores=motores;
	}


	public abstract float calcularConsumo();
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMotores() {
		return motores;
	}
	public void setMotores(int motores) {
		this.motores = motores;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", motores=" + motores + "]";
	}
	
	

	
	
	
}
