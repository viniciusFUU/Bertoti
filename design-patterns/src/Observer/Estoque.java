package Observer;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<ProdutoVendido> produtos = new ArrayList<>();

    public void adicionarProdutos(ProdutoVendido produto){
        produtos.add(produto);
    }

    public void removerProdutos(ProdutoVendido produto){
        produtos.remove(produto);
    }

    public void notificarProdutos(){
        for(ProdutoVendido produtoVendido : produtos){
            System.out.println(produtoVendido.updateQuantity());
        }
    }
}
