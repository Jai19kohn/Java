import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int palpite;
        System.out.println("digite seu palpite:");
        palpite = entrada.nextInt();
        if (palpite == 15) {
            System.out.println("Voce acertou!!!");
        } else {
            if (palpite < 15) {
                System.out.println("Seu palpite está abaixo!");
            } else {
                System.out.println("Seu palpite está acima!");
            }
        }
        entrada.close();
    }
}