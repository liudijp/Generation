package Generation.Cliente;

import java.util.Scanner;

public class PessoaJuridica extends ClienteEx {

    Scanner ler = new Scanner(System.in);

    private int cnpj;

    public PessoaJuridica(int idade, int celular, String nome, String cpf, String sexo, int cnpj) {
        super(idade, celular, nome, cpf, sexo);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("Cnpj : " + cnpj);
    }

    public void insere(){
        System.out.println("Insira nome da Empresa :");
        super.setNome(ler.nextLine());

        System.out.println("Insira a Idade da Empresa : ");
        super.setIdade(ler.nextInt());

        System.out.println("Digite o CNPJ: ");
        setCnpj(ler.nextInt());

    }

}
