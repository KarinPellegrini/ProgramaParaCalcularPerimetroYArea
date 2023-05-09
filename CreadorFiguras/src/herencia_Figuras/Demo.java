package herencia_Figuras;

public class Demo {

	public static void main(String[] args) {
		Figura circulo = new Circulo(5.0);
//		System.out.println(circulo.calculoArea());
//		System.out.println(circulo.calculoPerimetro());
//		
//		double radio = 5.0; // el radio del círculo
//		double perimetro = 2 * Math.PI * radio; // la fórmula para calcular el perímetro
//		System.out.println("El perímetro del círculo es: " + perimetro); // se muestra el resultado por consola
//		
//		double area = Math.PI * Math.pow(radio, 2); // la fórmula para calcular el área
//		System.out.println("El área del círculo es: " + area); // se muestra el resultado por consola

		
		Figura rectangulo = new Rectangulo(10.0, 5.0);
//		System.out.println(rectangulo.calculoPerimetro());
//		double longitud = 10.0; // la longitud del rectángulo
//		double anchura = 5.0; // la anchura del rectángulo
//		double perimetro = 2 * (longitud + anchura); // la fórmula para calcular el perímetro
//		System.out.println("El perímetro del rectángulo es: " + perimetro); // se muestra el resultado por consola
//		
//		System.out.println(rectangulo.calculoArea());
//		double longitud = 10.0; // la longitud del rectángulo
//		double anchura = 5.0; // la anchura del rectángulo
//		double area = longitud * anchura; // la fórmula para calcular el área
//		System.out.println("El área del rectángulo es: " + area); // se muestra el resultado por consola

		Figura triangulo = new Triangulo(3.0, 4.0, 5.0);
		System.out.println(triangulo.calculoArea());
		
		double a = 3.0; // la longitud del primer lado del triángulo
		double b = 4.0; // la longitud del segundo lado del triángulo
		double c = 5.0; // la longitud del tercer lado del triángulo
		double s = (a + b + c) / 2; // el semiperímetro
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // la fórmula de Herón para calcular el área
		System.out.println("El área del triángulo es: " + area); // se muestra el resultado por consola

		System.out.println(triangulo.calculoPerimetro());

	}

}
