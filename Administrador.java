public class Administrador extends Empregado {
    private double ajudaDeCustos;

    public Administrador(String nome, int codigoSetor, double salarioBase, double imposto, double ajudaDeCustos) {
        super(nome, codigoSetor, salarioBase, imposto);
        this.ajudaDeCustos = ajudaDeCustos;
    }

    public Administrador(String nome, int codigoSetor, double imposto, double ajudaDeCustos) {
        super(nome, codigoSetor, imposto);
        this.ajudaDeCustos = ajudaDeCustos;
    }

    public Administrador(String nome, int codigoSetor, double imposto) {
        super(nome, codigoSetor, imposto);
        this.ajudaDeCustos = 0;
    }

    public Administrador(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaDeCustos) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCustos = ajudaDeCustos;
    }

    public Administrador(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaDeCustos) {
        super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCustos = ajudaDeCustos;
    }

    public double getAjudaDeCustos() {
        return ajudaDeCustos;
    }

    public void setAjudaDeCustos(double ajudaDeCustos) {
        this.ajudaDeCustos = ajudaDeCustos;
    }

    @Override
    public double calcularSalario() {
        return (super.calcularSalario() + ajudaDeCustos);
    }
}
