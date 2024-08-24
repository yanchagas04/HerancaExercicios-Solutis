public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    

    public Vendedor(String nome, int codigoSetor, double salarioBase, double imposto, double valorVendas,
            double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }



    public Vendedor(String nome, int codigoSetor, double imposto, double valorVendas, double comissao) {
        super(nome, codigoSetor, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, int codigoSetor, double imposto,  double comissao) {
        super(nome, codigoSetor, imposto);
        this.valorVendas = 0;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }



    public Vendedor(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    

    @Override
    public double calcularSalario() {
        return ((getSalarioBase() + (valorVendas * (comissao/100))) * (1 - (getImposto()/100)));
    }



    public double getValorVendas() {
        return valorVendas;
    }



    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }



    public double getComissao() {
        return comissao;
    }



    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
