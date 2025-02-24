package Observer;

public class Venda {
    public static void main(String[] args) {
        Banana banana = new Banana(10);
        Estoque estoque = new Estoque();

        estoque.adicionarProdutos(banana);
        estoque.notificarProdutos();

        banana.setQuantidade(7);

        estoque.notificarProdutos();
    }
}
