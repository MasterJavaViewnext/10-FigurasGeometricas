package es.rodal.figuras.abstracto.principal;

import java.util.ArrayList;
import java.util.List;

import es.rodal.figuras.abstracto.clases.Circulo;
import es.rodal.figuras.abstracto.clases.Cuadrado;
import es.rodal.figuras.abstracto.clases.Figura;
import es.rodal.figuras.abstracto.clases.Rectangulo;

public class Principal {
	public static void main(String[] args) {
		Figura circulo = new Circulo(5);
		Figura cuadrado = new Cuadrado(4);
		Figura rectangulo = new Rectangulo(4, 6);
		
		List<Figura> figuras = new ArrayList<>();
		
		figuras.add(circulo);
		figuras.add(cuadrado);
		figuras.add(rectangulo);
		
		for (Figura figura : figuras) {
			System.out.println(figura.calcularArea());
			System.out.println(figura.calcularPerimetro());
		}
		
	}
}
