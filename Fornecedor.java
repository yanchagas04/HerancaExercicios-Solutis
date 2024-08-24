public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor(String nome, String telefone, String endereco, double valorCredito, double valorDivida) {
        super(nome, telefone, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.valorCredito = 0.0;
        this.valorDivida = 0.0;
    }

    public Fornecedor(String nome) {
        super(nome);
        this.valorCredito = 0.0;
        this.valorDivida = 0.0;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return (valorCredito - valorDivida);
    }
}
