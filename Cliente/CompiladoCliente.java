package Generation.Cliente;

import java.util.Scanner;

public class CompiladoCliente {
/*    public class ClienteEx {
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

        public void visualizar() {
            System.out.println("\nNome do Cliente : " + nome + "\nIdade : " + idade);

        }

        public class PessoaFisica extends Generation.Cliente.ClienteEx {

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
            public void visualizar() {

                super.visualizar();
                System.out.println("Ano de Nascimento :" + this.anoNasc);

            }

            public void insere() {
                System.out.println("Insira nome do Cliente :");
                super.setNome(ler.nextLine());

                System.out.println("Insira a Idade : ");
                super.setIdade(ler.nextInt());

                System.out.println("Insira o Ano de Nascimento : ");
                anoNasc = ler.nextInt();

            }

            public class TestaCliente {

                public static void main(String[] args) {

                    Scanner ler = new Scanner(System.in);

                    String nome = "";
                    String cpf = "";
                    String sexo = "";
                    int idade = 0;
                    int celular = 0;
                    int anoNasc = 0;
                    int cnpj = 0;

                    Generation.Cliente.PessoaFisica clientef = new Generation.Cliente.PessoaFisica(idade, celular, nome, cpf, sexo, anoNasc);
                    Generation.Cliente.PessoaFisica clientef1 = new Generation.Cliente.PessoaFisica(idade, celular, nome, cpf, sexo, anoNasc);
                    PessoaJuridica clientej = new PessoaJuridica(idade, celular, nome, cpf, sexo, cnpj);

                    clientef.insere();
                    clientef1.insere();
                    clientej.insere();

                    clientef.visualizar();
                    clientef1.visualizar();
                    clientej.visualizar();
                }

 */
            }
