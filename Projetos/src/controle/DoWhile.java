package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resp;
        do {
            System.out.print("Você deseja continuar? [Sim/Não]: ");
            resp = entrada.nextLine();
        } while(!resp.equalsIgnoreCase("Não"));

        System.out.println("Obrigado!");
    }
}
