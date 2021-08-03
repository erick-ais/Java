package fundamentos;

import javax.swing.*;

public class Conversao {
    public static void main(String[] args) {

        // CONVERSÃO DE TIPOS PRIMITIVOS
            double a = 1; // Implícita

            float b = (float) 1.5456799799; // Explícita!
            // OBS: O F no final é o mais ideal.
            // (tipo) CAST ex.: (float), (int)

            double e = 1.9999999;
            int f = (int) e;

        // CONVERSÃO NÚMERO PARA STRING
            Integer num = 10000;
            System.out.println(num.toString().length());
            System.out.println(num.toString());

            int n = 5000;
            System.out.println(Integer.toString(n));

        // CONVERSÃO STRING PARA NÚMERO
            String valor1 = JOptionPane.showInputDialog(
                    "Digite o primeiro número: ");
            String valor2 = JOptionPane.showInputDialog(
                    "Digite o segundo número: ");

            System.out.println(valor1 + valor2);
            double numero1 = Double.parseDouble(valor1);
            double numero2 = Double.parseDouble(valor2);

            double soma = numero1 + numero2;
            System.out.println("A soma é " + soma);
    }

    /*
        OBS.:
        toString() Converte para um tipo String;
        length(): Mostra o tamanho da String;
        Nem toda String vai ser possível converter para número;
        JoptionPane.showImputDialong(): Mostra uma interface gráfica
        Double.parseDouble(): Converte a String para número.
     */
}
