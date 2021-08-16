package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    double precoDesconto() {
        return preco * (1 - desconto);
    }

    double precoDesconto(double descontoGerente) {
        return preco * (1 - desconto + descontoGerente);
    }

}
