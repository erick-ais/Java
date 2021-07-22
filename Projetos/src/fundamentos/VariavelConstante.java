package fundamentos;

public class VariavelConstante {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.141559;

        double area = PI * raio * raio;
        System.out.println("AREA = " + area + " m²");

        raio = 10;
        area = PI * raio * raio;
        System.out.println("AREA = " + area + " m²");
    }

    /*
        OBS.:
        Para transformar uma variável em uma constante é só colocar "final";
        É recomendável usar letras maiúsculas em constantes;
        O sinal de "+" é usado para concatenação, não operação de adição!
     */
}
