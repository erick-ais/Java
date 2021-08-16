package caneta;

public class Aula02 {
    public static void main(String[] args) {

        // PRIMEIRO OBJETO
        Canetas c1 = new Canetas(); // Objeto criado
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5F;
        c1.carga = 80;
        // c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }

    /*
        Os objetos têm os mesmos atrinutos e métodos, mas não o mesmo estado!
     */
}
