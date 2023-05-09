package herencia_Figuras;

public class Circulo extends Figura {
	private Double radio;
	
	
	public Circulo(Double radio) {
		super();
		this.radio = radio;
	}

	@Override
	// área = pi x radio al cuadrado
	
	public Double calculoArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public Double calculoPerimetro() {
		//perímetro = 2 x pi x radio
		return 2 * Math.PI * radio;
	}

}
