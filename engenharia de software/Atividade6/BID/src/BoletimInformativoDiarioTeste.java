import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BoletimInformativoDiarioTeste {
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
}
