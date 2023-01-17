package Generation;

import java.util.Scanner;

public class TestaProduto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ano = 0;
        String nome = "";
        String plataforma = "";
        String categoria = "";
        String fisco = "";
        boolean fisico = false;

        Produto pdt  = new Produto(ano, nome, plataforma, categoria, fisico);
        Produto pdt2 = new Produto(ano, nome, plataforma, categoria, fisico);
        System.out.println("Digite o nome do 1o Jogo : ");
        nome = ler.nextLine();
        pdt.setNome(nome);
        System.out.println("Digite o nome do 2o Jogo : ");
        nome = ler.nextLine();
        pdt2.setNome(nome);

        System.out.println("Digite o ano de lançamento do 1o Jogo: ");
        ano = ler.nextInt();
        pdt.setAno(ano);
        System.out.println("Digite o ano de lançamento do 2o Jogo: ");
        ano = ler.nextInt();
        pdt2.setAno(ano);

        //System.out.println("Nome do Jogo : " + pdt.getNome() + "\nAno de Lançamento : " + pdt.getAno());
        pdt.visualizar();
        pdt2.visualizar();
    }
}
