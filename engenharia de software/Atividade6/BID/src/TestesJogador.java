import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestesJogador {
    PlayerController jogador = new PlayerController();

    @Test
    public void criarJogador(){
        jogador.createPlayer("Vini", "Au", "Vo");

        assertTrue(jogador.listaJogadores.size() == 1);
    }

    @Test
    public void buscaJogador(){
        jogador.createPlayer("Vini", "Au", "Vo");
        
        assertTrue(jogador.searchPlayer("Vini", "Au").getPlayerName() == jogador.listaJogadores.getFirst().getPlayerName());
    }

    @Test
    public void alterarJogador(){
        jogador.createPlayer("Vini", "Au", "Vo");
        jogador.updateNamePlayer("Vini", "Vinicin");

        assertTrue(jogador.listaJogadores.getFirst().getPlayerName() == "Vinicin");
    }

    @Test
    public void excluirJogador(){
        jogador.createPlayer("Vini", "Au", "Vo");
        jogador.deletePlayer("Vini", "Au", "Vo");

        assertTrue(jogador.listaJogadores.size() == 0);
    }
}
