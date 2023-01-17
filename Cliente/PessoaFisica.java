package Generation.Cliente;

import java.util.Scanner;

public class PessoaFisica extends ClienteEx {

    Scanner ler = new Scanner(System.in);

    private int anoNasc;


    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public PessoaFisica(int idade, int celular, String nome, String cpf, String sexo, int anoNasc) {
        super(idade, celular, nome, cpf, sexo);
        this.anoNasc = anoNasc;

    }

    @Override
    public void visualizar(){

        super.visualizar();
        System.out.println("Ano de Nascimento :" + this.anoNasc);

    }

    public void insere(){
        System.out.println("Insira nome do Cliente :");
        super.setNome(ler.nextLine());

        System.out.println("Insira a Idade : ");
        super.setIdade(ler.nextInt());

        System.out.println("Insira o Ano de Nascimento : ");
        anoNasc = ler.nextInt();

    }

}
