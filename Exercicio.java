import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        // criar o objeto para ler os dados
        Scanner leitor = new Scanner(System.in);

        //ler o nome do aluno
        System.out.println("digite o nome do aluno:");
        String nome = leitor.next() + leitor.nextLine();

        //ler as notas das CPs (3 cps)
        System.out.println("digite a nota da CP 1");
        double cp1 = leitor.nextDouble();

        System.out.println("digite a nota da CP 2");
        double cp2 = leitor.nextDouble();

        System.out.println("digite a nota da CP 3");
        double cp3 = leitor.nextDouble();

        // ler a nota do challenge

        System.out.println("digite a nota do challenge");
        double challenge = leitor.nextDouble();

        // ler a nota da GS

        System.out.println("digite a nota da GS");
        double GS = leitor.nextDouble();

        //calcular a média de CP
        double mediaCp = (cp1 + cp2 + cp3) /3;

        //calcular a média final
        double media = mediaCp * 0.2 + challenge * 0.2 + GS * 0.6;

        // exibir o nome e a média final
        System.out.println(nome + " possui a média " + media);




    }
















}
