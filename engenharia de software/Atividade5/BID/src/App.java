public class App {
    public static void main(String[] args) throws Exception {
        PlayerController player = new PlayerController();
        player.createPlayer("Vinicius", "Monteiro", "volante");
        player.showPlayer();

        TeamController team = new TeamController();
        team.createTeam("Corinthians", "Brasil");
        team.showTeam();
        // team.searchTeam("Corinthians", "Brasil");
        // team.updateTeamName("Corinthians", "Real Madrid");
        // team.showTeam();
        // team.updateTeamCountry("Brasil", "Espanha");
        // team.showTeam();
        // team.deleteTeam("Real Madrid", "Espanha");
        // team.showTeam();
        
        PlayerWithTeamController bid = new PlayerWithTeamController();
        bid.relationPlayerTeam(player, team, "Vinicius", "Monteiro", "Corinthians", "Brasil");
        bid.showBid();
    }
}
