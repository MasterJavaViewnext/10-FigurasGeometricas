package es.rodal.figuras.abstracto.clases;

public class Circulo extends Figura {

	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.round(Math.PI*(Math.pow(this.radio, 2)));
	}

	@Override
	public double calcularPerimetro() {
		return Math.round(2*Math.PI*this.radio);
	}

}
