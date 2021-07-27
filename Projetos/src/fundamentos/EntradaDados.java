package fundamentos;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // "in" Significa entrada de dados do teclado

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); // Entrada do tipo String
        System.out.println("Olá, " +  nome + "!");

        System.out.print("Qual sua idade?  ");
        int idade = entrada.nextInt(); // Entrada do Tipo Int
        System.out.println("Sua idade de " + idade + " anso é bacana.");

        entrada.close(); // Fechamento do Scanner!
    }
}
