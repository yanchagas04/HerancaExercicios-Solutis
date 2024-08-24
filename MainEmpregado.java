public class MainEmpregado {
    public static void main(String[] args) {
        Empregado empregadoTeste = new Empregado("Empregado Teste", 0, 7.5);

        //testando alguns métodos herdados de Pessoa:
        empregadoTeste.setTelefone("71 90000-0000");
        empregadoTeste.setEndereco("Rua das Flores, 123");

        //testando alguns métodos da classe Empregado:
        empregadoTeste.setSalarioBase(1400.0);
        empregadoTeste.setImposto(7.5);
        System.out.println("O salário do empregado é de R$" + empregadoTeste.calcularSalario());
    }
}
