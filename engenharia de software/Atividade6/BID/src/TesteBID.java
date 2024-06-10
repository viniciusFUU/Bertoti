import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteBID {
    PlayerWithTeamController relacao = new PlayerWithTeamController();
    PlayerController jogador = new PlayerController();
    TeamController time = new TeamController();

    @Test
    public void relacionamento(){
        jogador.createPlayer("Vini", "Augusto", "Volante");
        time.createTeam("Corinthians", "Brasil");

        relacao.relationPlayerTeam(jogador, time, jogador.listaJogadores.getFirst().getPlayerName(), jogador.listaJogadores.getFirst().getPlayerLastName(), time.teamList.getFirst().getTeamName(), time.teamList.getFirst().getTeamCountry());
        assertTrue(relacao.bidList.size() == 1);
    }

    @Test
    public void alterarClubeJogador(){
        jogador.createPlayer("Vini", "Augusto", "Volante");
        time.createTeam("Corinthians", "Brasil");
        time.createTeam("Real Madrid", "Spaña");
        relacao.relationPlayerTeam(jogador, time, jogador.listaJogadores.getFirst().getPlayerName(), jogador.listaJogadores.getFirst().getPlayerLastName(), time.teamList.getFirst().getTeamName(), time.teamList.getFirst().getTeamCountry());

        relacao.updateTeamPlayer(jogador, time, "Corinthians", "Real Madrid", "Vini", "Augusto", "Real Madrid", "Spaña");

        assertTrue(relacao.bidList.getFirst().getTeam().getTeamName() == "Real Madrid");
    }
}
