public class MainOperario {
    public static void main(String[] args) {

        Operario operarioTeste = new Operario("Operario Teste", 0, 7.5, 10);

        //testando alguns métodos herdados de Pessoa:
        operarioTeste.setTelefone("71 90000-0000");
        operarioTeste.setEndereco("Rua das Flores, 123");

        //testando alguns métodos da classe Empregado:
        operarioTeste.setSalarioBase(1200.0);
        
        //testando alguns métodos da classe Operario:
        operarioTeste.setValorProducao(1000.0);
        operarioTeste.setComissao(10.0);
        System.out.println("O salário do operário é de R$" + operarioTeste.calcularSalario());
    }
}
