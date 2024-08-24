public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public Operario(String nome, int codigoSetor, double imposto, double valorProducao, double comissao) {
        super(nome, codigoSetor, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public Operario(String nome, int codigoSetor, double imposto, double comissao) {
        super(nome, codigoSetor, imposto);
        this.valorProducao = 0;
        this.comissao = comissao;
    }
    public Operario(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public Operario(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public double getValorProducao() {
        return valorProducao;
    }
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return ((getSalarioBase() + (valorProducao * (comissao/100))) * (1 - (getImposto()/100)));
    }
    
}
