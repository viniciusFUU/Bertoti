public class Player {
    private String playerName;
    private String playerLastName;
    private String playerPosition;

    public Player(String name, String lastName, String position){
        this.playerName = name;
        this.playerLastName = lastName;
        this.playerPosition = position;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }
}
