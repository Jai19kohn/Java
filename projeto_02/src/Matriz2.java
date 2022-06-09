import java.util.Scanner;

import static java.lang.System.out;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Declaração de matriz
        int [][] numeros = new int[2][2];
        int somaLinhas = 0, total = 0;

        //armazena dados
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                out.println("Digite um número para a posição [" + i + "][" + j + "]: ");
                numeros[i][j] = teclado.nextInt();
            }
        }
        //percorre os dados para calcular o somatório
        for (int i = 0; i < numeros.length; i++){
            somaLinhas = 0;
            for(int j = 0; j < numeros[i].length; j++){
                somaLinhas+= numeros[i][j];
            }
            out.println("A soma da linha [" + i + "} é: " + somaLinhas);
            total += somaLinhas;
        }
        out.println("O somatório dos elementos da matriz é: " + total);

        //Percorre a matrix para imprimir  os dados
        out.println("==========================");
        out.println("|  Elementos da Matriz   |");
        out.println("==========================");

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                out.print(numeros[i][j] + "\t");
            }
            out.println("");
        }
        teclado.close();
    }
}