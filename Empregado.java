public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, int codigoSetor, double salarioBase, double imposto) {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public Empregado(String nome, int codigoSetor, double imposto) {
        super(nome);
        this.codigoSetor = codigoSetor;
        this.imposto = imposto;
    }
    public Empregado(String nome, String endereco, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public Empregado(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public int getCodigoSetor() {
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        return (salarioBase * (1 - (imposto/100)));
    }
}
