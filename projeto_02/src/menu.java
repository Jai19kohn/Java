import java.util.Scanner;

public class menu {
    public static void main (String [] args) {
        System.out.println("====== Menu de Opções ======");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Lista de Produtos");
        System.out.println("3- Sair do Sistema");
        System.out.println("==== Escolha uma opção ====");

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Você escolheu o menu 1");
                System.out.println("Que é a opção Cadastrar Produtos");
                break;
            case 2:
                System.out.println("Você escolheu o menu 2");
                System.out.println("Que é a opção Lista de Produtos");
                break;
            case 3:
                System.out.println("Você escolheu o menu 3");
                System.out.println("Que é a opção Sair do Sistema");
                break;
            default:
                System.out.println("Item de menu inválido");
        }
        entrada.close();
    }
}
