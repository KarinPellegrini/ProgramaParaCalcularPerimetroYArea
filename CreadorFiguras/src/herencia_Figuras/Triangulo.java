package herencia_Figuras;

public class Triangulo extends Figura {
	private Double ladoA;
	private Double ladoB;
	private Double ladoC;
	
	public Triangulo(Double ladoA, Double ladoB, Double ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	@Override
	public Double calculoArea() {
		//Fórmula Herón
//		s = (a + b + c) / 2
//				área = √(s(s-a)(s-b)(s-c))
//
//				Donde "a", "b" y "c" son las longitudes de los tres lados del triángulo, y "s" es el semiperímetro, que se calcula como la mitad de la suma de los tres lados:
//
//				s = (a + b + c) / 2
		
		Double s = (ladoA+ladoB+ladoC)/2;
		Double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
		return area;
	}

	@Override
	public Double calculoPerimetro() {
		return ladoA + ladoB + ladoC;
	}
	
	
	
	
}
