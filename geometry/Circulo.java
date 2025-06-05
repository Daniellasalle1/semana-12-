package geometry;

public class Circulo implements FormaGeometrica{

	public double raio;
	public double area;
	public double perimetro;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		System.out.println( 2 * 3.14 * (raio * raio));
		return area;
		
	}
	
	@Override
	public double calcularPerimetro() {
		System.out.println(2 * 3.14 * raio);
		return perimetro;
	}
	
	
	public static void main(String[] args) {
		Circulo FormaGeometrica = new Circulo(10);
		FormaGeometrica.calcularArea();
		FormaGeometrica.calcularPerimetro();
	}

}
