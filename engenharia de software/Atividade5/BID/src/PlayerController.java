import java.util.LinkedList;
import java.util.List;

public class PlayerController {
    List<Player> listaJogadores = new LinkedList<>();
    
    public void createPlayer(String nome, String sobrenome, String posicao){
        Player player = new Player(nome, sobrenome, posicao);
        listaJogadores.add(player);
    }

    public Player searchPlayer(String nome, String sobrenome){
        for (Player player : listaJogadores){
            if (player.getPlayerName().equals(nome) && player.getPlayerLastName().equals(sobrenome)){
                return player;
            }
        }
        return null;
    }

    public Player updateNamePlayer(String name){
        for (Player player : listaJogadores){
            if (player.getPlayerName().equals(name)){
                player.setPlayerName(name);
            }
        }
        return null;
    }

    public Player updateLastNamePlayer(String lastName){
        for (Player player : listaJogadores){
            if (player.getPlayerLastName().equals(lastName)){
                player.setPlayerLastName(lastName);
            }
        }
        return null;
    }

    public Player updatePositionPlayer(String position){
        for (Player player : listaJogadores){
            if (player.getPlayerPosition().equals(position)){
                player.setPlayerPosition(position);
            }
        }
        return null;
    }

    public Player deletePlayer(String namePlayer, String lastNamePlayer, String positionPlayer){
        for(Player player : listaJogadores){
            if (player.getPlayerName().equals(namePlayer) && player.getPlayerLastName().equals(lastNamePlayer) && player.getPlayerPosition().equals(positionPlayer)){
                listaJogadores.remove(player);
            }
        }
        return null;
    }
}
