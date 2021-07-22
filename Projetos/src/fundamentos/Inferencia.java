package fundamentos;

public class Inferencia {

    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        // c = 4.5; Não pode misturar os tipos!!!
        // c = "Olá"; Pode porque é o mesmo tipo.
    }

}

/*
    OBS.:
    Inferência é usado o "var" que define o tipo de variável pelo valor;
    A inferência só é válida dentro do método;
    Não é possível trocar o valor da variável por outro tipo que foi definido pelo "var".
 */
