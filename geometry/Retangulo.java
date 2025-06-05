package geometry;

public class Retangulo implements FormaGeometrica{
	public float largura;
	public float altura;
	public float area;
	public float perimetro;
	
	
	
	
	public Retangulo(float largura, float altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		System.out.println(altura * largura);
		return area;
		
	}
	
	@Override
	public double calcularPerimetro() {
		System.out.println((altura*2) + (largura*2));
		return perimetro;
	}

	
	
	public static void main(String[] args) {
		Retangulo FormaGeometrica = new Retangulo(10, 20);
		FormaGeometrica.calcularArea();
		FormaGeometrica.calcularPerimetro();

	}


}
