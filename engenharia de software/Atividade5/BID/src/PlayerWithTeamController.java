import java.util.LinkedList;
import java.util.List;

public class PlayerWithTeamController {
    List<PlayerWithTeam> bidList = new LinkedList<>();

    public void relationPlayerTeam(PlayerController playerP, TeamController teamP, String playerName, String lastNome, String TeamName, String TeamCountry){
        Player player = playerP.searchPlayer(playerName, lastNome);
        Team team = teamP.searchTeam(TeamName, TeamCountry);
        
        if (player != null && team != null){
            bidList.add(new PlayerWithTeam(player, team));
            System.out.println("Jogador adicionado com sucesso!");
        } else if (player == null){
            System.out.println("Não jogador há com este nome.");
        } else {
            System.out.println("Não há time com este nome.");
        }
    }

    public void showBid(){
        for (PlayerWithTeam registro : bidList){
            if (bidList.size() != 0){
                Player player = registro.getPlayer();
                Team team = registro.getTeam();

                System.out.println("Jogador " + player.getPlayerName() + " cadastrado no time " + team.getTeamName());
            } else {
                System.out.println("Sem cadastro");
            }
        }
    }
}