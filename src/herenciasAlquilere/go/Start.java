package herenciasAlquilere.go;

import herenciasAlquileres.Barco;
import herenciasAlquileres.Coche;
import herenciasAlquileres.Vehiculo;
import herenciasAlquileres.VehiculoConRuedas;

public class Start {

	public static void main(String[] args) {


		
// 		NO LO PUEDO HACER		
//		Vehiculo cochecitoRosa = new Vehiculo();
//		cochecitoRosa.setMatricula("3456KGF");
//		cochecitoRosa.setMarca("Seat");
//		cochecitoRosa.setModelo("600");
//		cochecitoRosa.setColor("Rosa");
//		cochecitoRosa.setMotores(6);
//		
//		System.out.println(cochecitoRosa);

		
		
//		Barco barcoChanquete = new Barco();
//		barcoChanquete.setMatricula("Gi-9345");
//		barcoChanquete.setMarca("Topolov");
//		barcoChanquete.setModelo("Premium Plus");
//		barcoChanquete.setColor("Blanco");
//		barcoChanquete.setMotores(12);
//		barcoChanquete.setEslora(220);
//		barcoChanquete.setManga(40);
//		barcoChanquete.setCalado(15);
//		System.out.println("el barco consume "+barcoChanquete.calcularConsumo());
//		
//		System.out.println(barcoChanquete);
		
		
// 		NO LO PUEDO HACER		
//		VehiculoConRuedas patinete = new VehiculoConRuedas();
//		patinete.setMatricula("");
//		patinete.setMarca("Xiaomi");
//		patinete.setModelo("GoProUltra");
//		patinete.setMotores(1);
//		patinete.setAncho(1);
//		patinete.setLongitud(2);
//		patinete.setNumeroRuedas(2);
//		patinete.setPuertas(0);
//		patinete.setColor("Gris turquesa");
//		System.out.println("el VCR consume "+patinete.calcularConsumo());
//		
//		System.out.println(patinete);
		
		
		System.out.println("\n**********************\n");
		
		Coche miBolido = new Coche("6789HGF","Citroen","DS5","Gris",1,2,5,4,5,500);
		System.out.println("el miBolido consume "+miBolido.calcularConsumo());
		System.out.println(miBolido);		
	}

}
