public class teste2 {
    public static void main(String[] args) {
        int controle = 10;
        long acumulador = 1;
        boolean condicao;
        System.out.println("Numero da interação\tCondição\tControle\tAcumulador");
        while(controle > 0){
            int interacao = 10 - controle + 1;
            acumulador *= controle;
            condicao = controle > 0;
            System.out.println("Interação " + interacao + "\t\t\t" + condicao + "\t\t\t" + controle + "\t\t\t" + acumulador);
            controle--;
        }
    }
}