import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestesJogador {
    TeamController time = new TeamController();

    @Test
    public void criarTime(){
        time.createTeam("Corinthians", "Brasil");

        assertTrue(time.teamList.size() == 1);
    }

    @Test
    public void deleteTime(){
        time.createTeam("Corinthians", "Brasil");
        time.deleteTeam("Corinthians", "Brasil");

        assertTrue(time.teamList.size() == 0);
    }

    @Test
    public void procurarTime(){
        time.createTeam("Corinthians", "Brasil");
        
        assertTrue(time.searchTeam("Corinthians", "Brasil"));
    }

    @Test
    public void alterarNomeTime(){
        time.createTeam("Corinthians", "Brasil");
        time.updateTeamName("São José");

        assertTrue(time.searchTeam("São José", "Brasil"));
    }
}