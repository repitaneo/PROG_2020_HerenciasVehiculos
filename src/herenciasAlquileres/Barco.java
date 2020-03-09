package herenciasAlquileres;

public class Barco extends Vehiculo {

	private int eslora;
	private int manga;
	private int calado;
	
	
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getManga() {
		return manga;
	}
	public void setManga(int manga) {
		this.manga = manga;
	}
	public int getCalado() {
		return calado;
	}
	public void setCalado(int calado) {
		this.calado = calado;
	}
	@Override
	public String toString() {
		return super.toString()+" Barco [eslora=" + eslora + ", manga=" + manga + ", calado=" + calado + "]";
	}
	
	@Override
	public float calcularConsumo() {
		
		return 10*motores+(0.2f*manga);
	}
	

	
	

	
	
	
	
	
}
