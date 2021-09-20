package AtividadePLP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(">Escolha uma questão de 1 a 5!<");
        System.out.println("-------------------------------");
        System.out.println("    1 - Pessoa Mais Velha");
        System.out.println("    2 - Salário Médio");
        System.out.println("    3 - Retangulo");
        System.out.println("    4 - Aumento de Funcionário");
        System.out.println("    5 - Notas de Aluno");
        System.out.println("-------------------------------");

        int questao = scan.nextInt();


        switch (questao) {
            case 1 -> {
                System.out.println("Questão 1!");

                q1 p1 = new q1();
                q1 p2 = new q1();
                System.out.println("Informe primeiro nome e idade: ");
                p1.setNome(scan.next());
                p1.setIdade(scan.nextInt());
                System.out.println("Informe segundo nome e idade: ");
                p2.setNome(scan.next());
                p2.setIdade(scan.nextInt());

                if (p1.getIdade() > p2.getIdade()){System.out.println("Pessoa mais velha: "+p1.getNome());}
                else {System.out.println("Pessoa mais velha: "+p2.getNome());}

            }
            case 2 -> {
                System.out.println("Questão 2!");

                q2 p1 = new q2();
                q2 p2 = new q2();
                System.out.println("Informe nome e salario");
                p1.setNome(scan.next());
                p1.setSalario(scan.nextFloat());
                System.out.println("Informe nome e salario");
                p2.setNome(scan.next());
                p2.setSalario(scan.nextFloat());

                float med = (p1.getSalario() + p2.getSalario()) / 2;
                System.out.println("Salário medio: "+med);

            }
            case 3 -> {
                System.out.println("Questão 3!");

                retangulo retangulo = new retangulo();

                System.out.println("Informe valor de largura: ");
                retangulo.setLargura(scan.nextDouble());
                System.out.println("Informe valor de altura: ");
                retangulo.setAltura(scan.nextDouble());

                System.out.println("Area: " + retangulo.getArea());
                System.out.println("Perimetro: "+retangulo.getPerimetro());
                System.out.println("Diagonal: "+retangulo.getDiagonal());

            }
            case 4 -> {
                System.out.println("Questão 4!");

                funcionario funcionario = new funcionario() ;

                System.out.println("Informe nome, salario e imposto respectivamente: ");
                funcionario.setNome(scan.next());
                funcionario.setSalarioBruto(scan.nextDouble());
                funcionario.setImposto(scan.nextDouble());

                funcionario.setSalarioLiq(funcionario.getSalarioBruto()- funcionario.getImposto());
                System.out.println(funcionario.getNome()+", "+funcionario.getSalarioLiq());

                System.out.println("Informe porcentagem de aumento: ");
                funcionario.setPorc(scan.nextDouble());
                funcionario.setPorc(funcionario.getPorc()/100);

                funcionario.setAumentarSal(funcionario.getSalarioLiq()+(funcionario.getPorc())* funcionario.getSalarioBruto());
                System.out.println("Dados atualizados: "+funcionario.getNome()+", R$"+funcionario.getAumentarSal());

            }
            case 5 -> {
                System.out.println("Questão 5!");

                aluno aluno = new aluno();
                aluno.setNotaMin(60.00);

                System.out.println("Informe nome do aluno: ");
                aluno.setNomeAluno(scan.next());
                System.out.println("Informe as 3 notas obtidas: ");
                aluno.setNota1(scan.nextInt());
                aluno.setNota2(scan.nextInt());
                aluno.setNota3(scan.nextInt());

                aluno.setNotaFim(aluno.getNota1()+ aluno.getNota2()+ aluno.getNota3());

                System.out.println(aluno.getNotaFim());

                if (aluno.getNotaFim() < aluno.getNotaMin()){
                    aluno.setNotaRest(aluno.getNotaMin()- aluno.getNotaFim());
                    System.out.println("Reprovado!\n"+"Faltaram "+aluno.getNotaRest()+" pontos.");
                }else{
                    System.out.println("Aprovado!");
                }
            }
        }
    }
}
