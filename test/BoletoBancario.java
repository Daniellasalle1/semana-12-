package test;

public class BoletoBancario implements pagamento {
	private double valor;
	
	public BoletoBancario(double valor) {
        this.valor = valor;
    } 
	
	@Override
	public double realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito no valor de: " + valor);
        return valor;
    }

	public static void main(String[] args) {
		BoletoBancario pagamento = new BoletoBancario(15000.50);
        pagamento.realizarPagamento();

	}

}
