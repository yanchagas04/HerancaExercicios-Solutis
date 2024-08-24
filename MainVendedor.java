public class MainVendedor {
    public static void main(String[] args) {
        Vendedor vendedorTeste = new Vendedor("Vendedor Tesste", 0, 7.5, 10);

        //testando alguns métodos herdados de Pessoa:
        vendedorTeste.setTelefone("71 90000-0000");
        vendedorTeste.setEndereco("Rua das Flores, 123");

        //testando alguns métodos da classe Empregado:
        vendedorTeste.setSalarioBase(1200.0);

        //testando alguns métodos da classe Vendedor:
        vendedorTeste.setValorVendas(1000.0);
        System.out.println("O salário do vendedor é de R$" + vendedorTeste.calcularSalario());
    }
}
