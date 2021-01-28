public class Player {
    String score_min;
    String K_D;
    String kills;
    String deaths;
    String win_percentage;
    String wins;

    public String toString(){
        return "Player K/D ratio: " + K_D + "\nPlayer total kills: " + kills
                + "\nPlayer total deaths: " + deaths + "\nPlayer wins: " + wins
                + "\nPlayer win percentage: " + win_percentage + "\nPlayer score/min: "
                + score_min;
    }
}
