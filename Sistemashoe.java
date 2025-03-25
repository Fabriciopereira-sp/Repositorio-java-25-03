import java.util.Scanner;

public class Sistemashoe {
    public static void main(String[] args) {

        //criar o scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o modelo do tênis");
        String tenis = scanner.next() + scanner.nextLine();

        System.out.println("digite a cor do tênis");
        String cor = scanner.next() + scanner.nextLine();

        System.out.println("digite o número do tênis");
        int tamanho = scanner.nextInt();

        System.out.println("digite o valor do seu orçamento");
        double preco = scanner.nextDouble();;

        System.out.println("este modelo está disponivel?");
        boolean disponivel = scanner.next().toLowerCase()== "sim";

        //criar objeto tenis
        Tenis tenis1 = new Tenis();;
        //colocar os valores lidos dentro do objeto.
        tenis1.modelo = tenis;
        tenis1.cor = cor;
        tenis1.tamanho = tamanho;
        tenis1.disponivel = disponivel;
        tenis1.preco = preco;
        //exibir os valores que estão dentro do objeto
        System.out.println("modelo " + tenis1.modelo);
        System.out.println("cor " + tenis1.cor);
        System.out.println("tamanho " + tenis1.tamanho);
        System.out.println("disponivel " + tenis1.disponivel);
        System.out.println("preco " + tenis1.preco);













    }
























}
