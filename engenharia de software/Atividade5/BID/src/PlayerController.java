import java.util.LinkedList;
import java.util.List;

public class PlayerController {
    List<Player> listaJogadores = new LinkedList<>();
    
    public void createPlayer(String nome, String sobrenome, String posicao){
        Player player = new Player(nome, sobrenome, posicao);
        listaJogadores.add(player);
        // System.out.println(listaJogadores.size());
    }

    public Player searchPlayer(String nome, String sobrenome){
        for (Player player : listaJogadores){
            if (player.getPlayerName().equals(nome) && player.getPlayerLastName().equals(sobrenome)){
                System.out.println("Jogador encontrado");
                return player;
            }
        }
        System.out.println("Jogador não encontrado");
        return null;
    }

    public Player updateNamePlayer(String name, String nomeAlterado){
        for (Player player : listaJogadores){
            if (player.getPlayerName().equals(name)){
                player.setPlayerName(nomeAlterado);
            }
        }
        return null;
    }

    public Player updateLastNamePlayer(String lastName, String lasNameAlterado){
        for (Player player : listaJogadores){
            if (player.getPlayerLastName().equals(lastName)){
                player.setPlayerLastName(lasNameAlterado);
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
                System.out.println("Time excluido");
            }
        }
        System.out.println("Não existe nenhum time com este nome");
        return null;
    }

    public void showPlayer(){
        if(listaJogadores.size() != 0){
            for (Player player : listaJogadores){
                String nome = player.getPlayerName(); 
                String sobreNome = player.getPlayerLastName(); 
                String posicao = player.getPlayerPosition(); 
                System.out.println("Jogador: " + nome + " " + sobreNome + "\nPosição: " + posicao);
            }
        } else {
            System.out.println("Não há registro");
        }

    }
}
