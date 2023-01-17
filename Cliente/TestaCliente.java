package Generation.Cliente;

import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome = "";
        String cpf = "";
        String sexo = "";
        int idade = 0;
        int celular = 0;
        int anoNasc = 0;
        int cnpj    = 0;

        PessoaFisica clientef  = new PessoaFisica(idade, celular, nome, cpf, sexo, anoNasc);
        PessoaFisica clientef1 = new PessoaFisica(idade, celular, nome, cpf, sexo, anoNasc);
        PessoaJuridica clientej = new PessoaJuridica(idade,celular,nome,cpf,sexo, cnpj);

        clientef.insere();
        clientef1.insere();
        clientej.insere();

        clientef.visualizar();
        clientef1.visualizar();
        clientej.visualizar();
    }


}
