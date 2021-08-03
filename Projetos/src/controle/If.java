package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média do aluno: ");
        double media = entrada.nextDouble();

        if(media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if(media < 7 && media >= 5) {
            System.out.println("Aluno em Recuperação!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

        entrada.close();
    }

    /*
        OBS.: Estrutura de Controle

        SIMPLES
            if(expresao-logica) {
                BLOCO DE CÓDIGO SE VERDADEIRO
            }

        COMPOSTA
            if(expresao-logica) {
                Bloco de código se verdadeiro
            } else {
                Bloco de código se falso
            }

        ANINHADA
           if(expresao-logica) {
                Bloco de código se verdadeiro
           } else if(expressao-logica) {
                Bloco de código se verdadeiro
           } else if(expressao-logica) {
                Bloco de código se verdadeiro
           } else if(expressao-logica) {
                Bloco de código se verdadeiro
           } else if(expressao-logica) {
                Bloco de código se verdadeiro
           } else {
                Bloco de código se falso (opcional)
           }
     */
}
