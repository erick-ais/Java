package banco;

public class Principal {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setCliente("Erick Augusto Izidoro Souza");
        c1.setCpf("478.658.980.96");
        c1.setTipo("Corrente");
        c1.setConta(6547);
        c1.setAgencia(465870);
        c1.depositar(1750);
        c1.sacar(250);
        c1.estadoAtual();

        ContaBanco c2 = new ContaBanco();
        c2.setCliente("Natalia Ferreira da Silva");
        c2.setCpf("457.965.021-21");
        c2.setTipo("Poupança");
        c2.setConta(4578);
        c2.setAgencia(654480);
        c2.sacar(20);
        c2.estadoAtual();
    }
}
