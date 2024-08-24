public class MainAdministrador {
    public static void main(String[] args) {

        Administrador administradorTeste = new Administrador("Administrador Teste", 0, 7.5);

        //testando alguns métodos herdados de Pessoa:
        administradorTeste.setTelefone("71 90000-0000");
        administradorTeste.setEndereco("Rua das Flores, 123");

        //testando alguns métodos da classe Empregado:
        administradorTeste.setSalarioBase(1500.0);
        
        //testando alguns métodos da classe Administrador:
        administradorTeste.setAjudaDeCustos(250);
        System.out.println("O salário do administrador é de R$" + administradorTeste.calcularSalario());
    }
}
