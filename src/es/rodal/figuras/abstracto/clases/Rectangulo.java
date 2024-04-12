package es.rodal.figuras.abstracto.clases;

public class Rectangulo extends Poligono {
	public Rectangulo (double altura, double base) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return this.base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2*(this.altura+this.base);
	}
}
