package test;

public class CartaoCredito implements pagamento {
    private double valor;
    
    public CartaoCredito(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito no valor de: " + valor);
        return valor;
    }

    public static void main(String[] args) {
        CartaoCredito pagamento = new CartaoCredito(150.50);
        pagamento.realizarPagamento();
    }
}
