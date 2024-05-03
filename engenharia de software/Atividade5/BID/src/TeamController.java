import java.util.LinkedList;
import java.util.List;

public class TeamController {
    List<Team> teamList = new LinkedList<>();

    public void createTeam(String teamName, String teamCountry){
        for (Team team : teamList){
            if (team.getTeamName().equals(teamName)){
                teamList.add(team);
            }
        }
    }

    public Team searchTeam(String name, String country){
        for (Team team : teamList){
            if (team.getTeamName().equals(name) && team.getTeamCountry().equals(country)){
                return team;
            }
        }
        return null;
    }

    public Team updateTeamName(String name){
        for (Team team : teamList){
            if (team.getTeamName().equals(name)){
                team.setTeamName(name);
            }
        }
        return null;
    }

    public Team updateTeamCountry(String country){
        for (Team team : teamList){
            if (team.getTeamCountry().equals(country)){
                team.setTeamName(country);
            }
        }
        return null;
    }



}
