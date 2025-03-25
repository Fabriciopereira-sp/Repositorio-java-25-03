import java.util.Scanner;

public class Operadoresaritimeticos {

    public static void main(String[] args) {
        //declarar 3 variaveis (cp,challange,cp)

        float cp = 8;
        float challange = 6;
        float gs = 7;

        //calculando as médias

        float media = (cp + challange + gs) /3;
        System.out.print(media);

        // média ponderada.

        double ponderada = (cp * 0.2) + (challange * 0.2) + (gs * 0.6);
        System.out.print("A média é " + ponderada);

        //incremento

        int x = 10;
        x++; //incremento 10+1
        x--; //decremento 11-1
        x +=2; // 10 + 2
        x -=4; // 12 - 4
        x *= 3; //8*3
        x /= 4; //24/4
        x %= 2; // x =0,12 mas como é int, vai aparecer 0
        System.out.println(x); //x = 0
















    }







}
