package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        // p1.nome = "Notebook";
        p1.preco = 4750.99;
        p1.desconto = 0.25;

        var p2 = new Produto("Caneta Preta");
        // p2.nome = "Caneta Azul";
        p2.preco = 12.5;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoDesconto();
        double precoFinal2 = p2.precoDesconto(0.1);
        double media = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho: R$%.2f Reais!", media);
    }
}
