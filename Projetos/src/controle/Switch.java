package controle;

public class Switch {
    public static void main(String[] args) {
        String faixa = "preta";

        switch(faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai");
                break;
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
                break;
            case "roxa":
                System.out.println("Sei o Heian Godan");
                break;
            case "verde":
                System.out.println("Sei o Heian Yodan");
                break;
            default:
                System.out.println("Não sei de nada!");
        }
    }
}
