package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // INTEIROS
        byte num1 = 17;
        short num2= 1750;
        int num3 = 1750;
        long num4 = 3_134_845_223L; // O "L" no final especifica o tipo long.

        System.out.println("byte: 8bits = 1byte ex.: " + num1);
        System.out.println("short: 16bits = 2byte ex.: " + num2);
        System.out.println("int: 32bits = 4byte ex.: " + num3);
        System.out.println("long: 64bits = 8byte ex.: " + num4);

        // PONTO FLUTUANTE.........................................................
        float num5 = 578.54F; // O "F" indica que é um tipo float e não double!
        double num6 = 2_991_797_103.01;

        System.out.println("float: 32bits ex.: " + num5);
        System.out.println("double: 64bits ex.: " + num6);

        // BOOLEANO................................................................
        boolean status1 = true; // 1bit (o ou 1)
        boolean status2 = false;

        // CHAR....................................................................
        char letra = 'A'; // Não pode ser mais de uma letra! 16bits


        String palavra = "Bom dia!";

    }
}
