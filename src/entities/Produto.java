package entities;

public class Produto { //classe produto

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque() { //função que retorna o total no estoque
        return preco * quantidade;
    }

    public void adccProdutos(int quantidade) { // função que acrescenta ao estoque
        this.quantidade += quantidade;

    }

    public void removeProduto(int quantidade) {//  função que retira do estoque
        this.quantidade -= quantidade;
    }

    public String toString() { //formatação do texto
        return nome
                + ", R$ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$ "
                + String.format("%.2f", valorTotalEmEstoque());

    }
}
