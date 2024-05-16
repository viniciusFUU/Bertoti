public class TesteRegistro {
    PlayerController jogador = new PlayerController();
    TeamController time = new TeamController();
    PlayerWithTeamController relacao = new PlayerWithTeamController();

    @Test
    public void relacionamento(){
        jogador.createPlayer("Vinicius", "Monteiro", "Volante");
        time.createTeam("Corinthians", "Brasil");
        relacao.relationPlayerTeam(jogador.getPlayerName(), time.getTeamName(), "Vinicius", "Monteiro", "Volante", "Corinthians", "Brasil");

        assertTrue(relacao.bidList.size() == 1);
    }
}