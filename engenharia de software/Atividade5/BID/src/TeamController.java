import java.util.LinkedList;
import java.util.List;

public class TeamController {
    List<Team> teamList = new LinkedList<>();

    public void createTeam(String teamName, String teamCountry){
        Team team = new Team(teamName, teamCountry);

        teamList.add(team);
    }

    public Team searchTeam(String name, String country){
        for (Team team : teamList){
            if (team.getTeamName().equals(name) && team.getTeamCountry().equals(country)){
                System.out.println(name + " foi encontrado");
                return team;
            }
        }
        System.out.println("Não há nenhum time com o nome " + name);
        return null;
    }

    public Team updateTeamName(String name, String nameAlterado){
        for (Team team : teamList){
            if (team.getTeamName().equals(name)){
                team.setTeamName(nameAlterado);
                System.out.println("Nome alterado com sucesso: " + name + " para " + nameAlterado);
                return team;
            }
        }
        System.out.println("Não existe time com este nome");
        return null;
    }

    public Team updateTeamCountry(String country, String countryAlterado){
        for (Team team : teamList){
            if (team.getTeamCountry().equals(country)){
                team.setTeamCountry(countryAlterado);
                System.out.println("País alterado de: " + country + " para: " + countryAlterado);
                return team;
            }
        }
        System.out.println("Não existe pais com o nome " + country);
        return null;
    }

    public Team deleteTeam(String teamP, String country){
        for (Team team : teamList){
            if (team.getTeamName().equals(teamP) && team.getTeamCountry().equals(country)){
                teamList.remove(team);
                System.out.println("time excluído com sucesso.");
                return team;
            }
        }
        System.out.println("noa");
        return null;
    }

    public void showTeam(){
        if (teamList.size() != 0){
            for (Team team : teamList){
                String nome = team.getTeamName();
                String pais = team.getTeamCountry();
                System.out.println("Time: " + nome + ", pais: " + pais);
            }
        } else {
            System.out.println("Não há time na lista");
        }
    }

}
