import javax.swing.JOptionPane;

public class Electrodomestico {
	
	//Constantes
	final double PRECIOBASE = 100;
	final String COLOR = "Blanco";
	final char CONSUMO = 'F';
	final double PESO = 5;
	
	//Atributos de clase
	private double preciobase;
	private String color;
	private char consumo;
	private double peso;
	
	public Electrodomestico() {
		this.preciobase = PRECIOBASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(double preciobase, int peso) {
		this.preciobase = preciobase;
		this.peso = peso;
	}
	
	public Electrodomestico(double preciobase, String color, char c, double d) {
		this.preciobase = preciobase;
		this.color = color;
		this.consumo = c;
		this.peso = d;
	}
	
	//Métodos de clase
	public static boolean comprobarColor(String color, boolean EsCorrecto) {
		color = color.toUpperCase();
		if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS") || color.equals("")) {
			EsCorrecto = true;
		} else {
			JOptionPane.showMessageDialog(null, "El color es incorrecto");
			EsCorrecto = false;
		}
		return EsCorrecto;
	}
	
	public static boolean comprobarConsumo(String consumo, boolean EsCorrecto) {
		consumo = consumo.toUpperCase();
		if (consumo.equals("A") || consumo.equals("B") || consumo.equals("C") || consumo.equals("D") || consumo.equals("E") || consumo.equals("F") || consumo.equals("")) {
			EsCorrecto = true;
			
		} else {
			JOptionPane.showMessageDialog(null, "El consumo energético es incorrecto");
			EsCorrecto = false;
		}
		return EsCorrecto;
	}
	
	public double getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(double preciobase) {
		this.preciobase = preciobase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
