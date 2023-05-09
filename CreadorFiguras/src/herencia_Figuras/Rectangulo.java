package herencia_Figuras;

public class Rectangulo extends Figura {
	
	private Double base;
	private Double altura;
	
	public Rectangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double calculoArea() {
		//área = base x altura
		// TODO Auto-generated method stub
		return base * altura;
	}

	@Override
	public Double calculoPerimetro() {
		//perimetro = 2 x ( base + altura )
		// TODO Auto-generated method stub
		return 2 * (base + altura);
	}
	
	
	
	
	

}
