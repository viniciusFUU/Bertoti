import java.util.LinkedList;
import java.util.List;

public class PlayerWithTeam {
    private Player player;
    private Team team;

    public PlayerWithTeam(Player player, Team team){
        this.player = player;
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
