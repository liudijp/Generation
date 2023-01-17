package Java;

import java.util.Scanner;
import Generation.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {
        int idade = 0;
        String cpf = "";
        String turno = "";
        String setor = "";
        String cargo = "";
        String nome = "";

        Scanner ler = new Scanner(System.in);
        Funcionario funcionario = new Funcionario(idade, cpf, turno, setor, cargo, nome);

        System.out.println("Digite o nome do Funcionario :");
        nome = ler.nextLine();
        funcionario.setNome(nome);

        System.out.println("Digite o cargo : ");
        cargo = ler.nextLine();
        funcionario.setCargo(cargo);

        System.out.println("Digite o setor : ");
        setor = ler.nextLine();
        funcionario.setSetor(setor);

        funcionario.visualizar();
    }
}
