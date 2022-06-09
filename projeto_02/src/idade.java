import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, acumuladroIdades = 0;
        int contador;
        for(contador = 0; contador < 5; contador++) {
            System.out.println("Digite a sua idade: ");
            idade = entrada.nextInt();
            acumuladroIdades += idade;
        }
        System.out.println("A soma das idades é " + acumuladroIdades);
        entrada.close();
    }
}
