package es.rodal.figuras.interfaz.principal;

import java.util.ArrayList;
import java.util.List;

import es.rodal.figuras.interfaz.clases.Circulo;
import es.rodal.figuras.interfaz.clases.Cuadrado;
import es.rodal.figuras.interfaz.clases.Medible;
import es.rodal.figuras.interfaz.clases.Rectangulo;

public class Principal {
	public static void main(String[] args) {
		Medible circulo = new Circulo(5);
		Medible cuadrado = new Cuadrado(4);
		Medible rectangulo = new Rectangulo(4, 6);
		
		List<Medible> figuras = new ArrayList<>();
		
		figuras.add(circulo);
		figuras.add(cuadrado);
		figuras.add(rectangulo);
		
		for (Medible figura : figuras) {
			System.out.println(figura.calcularArea());
			System.out.println(figura.calcularPerimetro());
		}
		
	}
}
