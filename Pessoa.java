public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome){
        this.nome = nome;
        this.endereco = null;
        this.telefone = null;
    }

    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = null;
    }

    public Pessoa(String nome, String telefone, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}