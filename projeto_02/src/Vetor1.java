import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        Scanner entrada = new Scanner(System.in);

        int tamanho = notas.length;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = entrada.nextDouble();
        }
            for (int i = 0; i < tamanho; i++) {
                System.out.println("nota: " + (i + 1) + " = " + notas[i]);
            }
            entrada.close();
        }
    }
