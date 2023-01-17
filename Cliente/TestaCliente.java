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
/*
        System.out.println("Insira nome do 1o Cliente :");
        nome = ler.nextLine();
        clientef.setNome(nome);
        System.out.println("Insira nome do 2o Cliente :");
        nome = ler.nextLine();
        clientef1.setNome(nome);

        System.out.println();

        System.out.println("Insira a 1a idade :");
        idade = ler.nextInt();
        clientef.setIdade(idade);
        System.out.println("Insira a 2a idade :");
        idade = ler.nextInt();
        clientef1.setIdade(idade);
*/
        clientef.insere();
        clientef1.insere();
        clientej.insere();

        clientef.visualizar();
        clientef1.visualizar();
        clientej.visualizar();
    }


}
