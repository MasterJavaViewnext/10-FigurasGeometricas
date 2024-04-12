package es.rodal.figuras.interfaz.clases;

public class Cuadrado implements Medible {
 
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return this.lado*4;
	}
	
	
}
