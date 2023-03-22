
public class TA08Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico Electrodomesticos[] = new Electrodomestico[6];
		
		Electrodomesticos[0] = new Electrodomestico();
		Electrodomesticos[1] = new Electrodomestico(20, "Gris", 'a', 10);
		Electrodomesticos[2] = new Electrodomestico(35.50, "Negro", 'b', 8);
		Electrodomesticos[3] = new Electrodomestico(15.75, "Azul", 'c', 3);
		Electrodomesticos[4] = new Electrodomestico(62, "Roja", 'd', 15.5);
		Electrodomesticos[5] = new Electrodomestico(825, "Blanco", 'e', 5);
		
		//Mostramos un listado de los electrodomesticos introducidos anteriormente
		System.out.println("Listado de electrodomesticos introducidos \n ");
		for (int i = 0; i < Electrodomesticos.length; i++) {
			System.out.println("Electrodomestico " + (i+1));
			System.out.println("Precio base: " + Electrodomesticos[i].getPreciobase() + " €");
			System.out.println("Color: " + Electrodomesticos[i].getColor());
			System.out.println("Consumo energetico: " + Electrodomesticos[i].getConsumo());
			System.out.println("Peso: " + Electrodomesticos[i].getPeso() + " Kg \n ");
		}
	}

}
