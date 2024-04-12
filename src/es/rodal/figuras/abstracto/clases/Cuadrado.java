package es.rodal.figuras.abstracto.clases;

public class Cuadrado extends Poligono {
	public Cuadrado (double lado) {
		this.altura = lado;
		this.base = lado;
	}

	@Override
	public double calcularArea() {
		return this.base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return this.base*4;
	}
	
}
