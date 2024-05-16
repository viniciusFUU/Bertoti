import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestesJogador {
    PlayerController jogadorController = new PlayerController();

    @Test
    public void testInsert(){    
        jogadorController.createPlayer("Vinicius", "Monteiro", "Atacante");
        jogadorController.createPlayer("Ricardo", "Campos", "Atacante");

        assertTrue(jogadorController.listaJogadores.size() == 2);
        assertTrue(jogadorController.listaJogadores.getLast().getPlayerName() == "Ricardo");
    }  

    @Test
    public void testDelete(){    
        jogadorController.createPlayer("Vinicius", "Monteiro", "Atacante");
        jogadorController.createPlayer("Ricardo", "Campos", "Atacante");
        jogadorController.deletePlayer("Vinicius", "Monteiro", "Atacante");

        assertTrue(jogadorController.listaJogadores.size() == 1);
    }

    @Test
    public void testBusca(){
        jogadorController.createPlayer("Vinicius", "Monteiro", "Atacante");
        
        assertTrue(jogadorController.searchPlayer("Vinicius", "Monteiro"));
    }

    @Test
    public void testUpdate(){
        jogadorController.createPlayer("Vinicius", "Monteiro", "Atacante");
        jogadorController.updateNamePlayer("Vinicius", "Ronaldinho");

        assertTrue(jogadorController.getPlayerName() == "Ronaldinho");
    }
}
