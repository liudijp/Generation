package Generation.Cliente;

public class ClienteEx {
    private int idade;
    private int celular;
    private String nome;
    private String cpf;
    private String sexo;

    public ClienteEx(int idade, int celular, String nome, String cpf, String sexo) {
        this.idade = idade;
        this.celular = celular;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void visualizar(){
        System.out.println("\nNome do Cliente : " + nome + "\nIdade : " + idade);

    }
}
