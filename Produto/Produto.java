package Generation;

public class Produto {
    int ano;
    String nome;
    String plataforma;
    String categoria;
    boolean fisico;

    public Produto(int ano, String nome, String plataforma, String categoria, boolean fisico) {
        this.ano = ano;
        this.nome = nome;
        this.plataforma = plataforma;
        this.categoria = categoria;
        this.fisico = fisico;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isFisico() {
        return this.fisico;
    }

    public void setFisico(boolean fisico) {
        this.fisico = fisico;
    }

    public void visualizar() {
        System.out.println("Int: ano\nString: nome, plataforma, categoria\nBoolean: fisico");
    }
}
