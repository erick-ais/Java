package controle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Até quanto quer contar? ");
        int n = entrada.nextInt();

        System.out.println("=======>");
        int cont = 1;
        while(cont <= n) {
            System.out.print(" " + cont);
            cont ++;
        }
        System.out.println("\n=======>");

        entrada.close();
    }
}
