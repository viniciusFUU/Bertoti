package Observer;

public class Banana implements ProdutoVendido{    
    private int quantidade;

    public Banana(int quantidade){
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