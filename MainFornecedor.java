public class MainFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedorTeste = new Fornecedor("Fornecedor Teste"); //criando um fornecedor puro (só com nome)

        //testando alguns métodos herdados de Pessoa:
        fornecedorTeste.setTelefone("71 90000-0000");
        fornecedorTeste.setEndereco("Rua das Flores, 123");

        //testando alguns métodos da classe Fornecedor:
        fornecedorTeste.setValorCredito(1000.0);
        fornecedorTeste.setValorDivida(500.0);
        double saldo = fornecedorTeste.obterSaldo();
        System.out.println("O saldo do fornecedor é de " + (saldo < 0 ? "-" : "") + "R$" + Math.abs(saldo));
        
    }
}
