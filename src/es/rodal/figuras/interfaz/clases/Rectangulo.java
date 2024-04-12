package es.rodal.figuras.interfaz.clases;

public class Rectangulo implements Medible {
	public double altura;
	public double base;
	
	public Rectangulo( double altura, double base) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return this.base*this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2*(this.base+this.altura);
	}
	
}
