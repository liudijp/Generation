package Generation;

public class Funcionario {
    private int idade;
    private String cpf;
    private String turno;
    private String setor;
    private String cargo;
    private String nome;

    public Funcionario(int idade, String cpf, String turno, String setor, String cargo, String nome) {
        this.idade = idade;
        this.cpf = cpf;
        this.turno = turno;
        this.setor = setor;
        this.cargo = cargo;
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void visualizar() {
        System.out.println("Int idade\n String: cpf, turno, setor, cargo, nome");
        System.out.println("Nome do funcionario : " + this.nome + "\nCargo : " + this.cargo + "\nSetor : " + this.setor);
    }
}
