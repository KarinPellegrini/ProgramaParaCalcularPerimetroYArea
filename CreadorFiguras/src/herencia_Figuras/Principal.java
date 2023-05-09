package herencia_Figuras;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb;
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		
		figuras.add(new Triangulo(3.0,4.0,5.0));
		figuras.add(new Triangulo(3.0,5.0,7.0));
		figuras.add(new Triangulo(6.0,8.0,10.0));
		figuras.add(new Rectangulo(10.0,2.0));
		figuras.add(new Rectangulo(4.0,3.0));
		figuras.add(new Rectangulo(5.0,5.0));
		figuras.add(new Circulo(1.0));
		figuras.add(new Circulo(2.0));
		figuras.add(new Circulo(3.0));
		
		for (Figura f: figuras) {
			 sb = new StringBuilder(f.toString());
			 sb.append(" / Su area es: ").append(f.calculoArea());
			 sb.append(" y su perimetro es: ").append(f.calculoPerimetro());
			 System.out.println(sb);
		}


	}

}
