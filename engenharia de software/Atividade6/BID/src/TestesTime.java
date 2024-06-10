import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestesTime {
    TeamController time = new TeamController();

    @Test
    public void criarTime(){
        time.createTeam("Corinthians", "Brasil");

        assertTrue(time.teamList.size() == 1);
    }

    @Test
    public void buscarTime(){
        time.createTeam("Corinthians", "Brasil");

        assertTrue(time.searchTeam("Corinthians", "Brasil") != null);
    }

    @Test
    public void alterarTime(){
        time.createTeam("Corinthians", "Brasil");
        time.updateTeamName("Corinthians", "Timão eo");

        assertTrue(time.teamList.getFirst().getTeamName() == "Timão eo");
    }

    @Test
    public void excluirTime(){
        time.createTeam("Corinthians", "Brasil");
        time.deleteTeam("Corinthians", "Brasil");

        assertTrue(time.teamList.size() == 0);
    }
}
