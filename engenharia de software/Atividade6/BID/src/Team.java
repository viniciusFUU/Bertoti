public class Team {
    private String teamName;
    private String teamCountry;

    public Team(String teamName, String teamCountry){
        this.teamName = teamName;
        this.teamCountry = teamCountry;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }
}
