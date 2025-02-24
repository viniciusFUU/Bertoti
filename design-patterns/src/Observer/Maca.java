package Observer;

public class Maca implements ProdutoVendido{
    private int quantidade;

    public Maca(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String updateQuantity() {
        return "Quantidade atual: " + quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
