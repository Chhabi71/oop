package workshop4;

public class Instances {
    public static void main(String[] args) {

        CompetitorSafe c = new EsportsSafe();

        if (c instanceof EsportsSafe) {
            EsportsSafe e = (EsportsSafe)c;
            System.out.println("Game Played: " + e.getGame());
        }
    }
}

class CompetitorSafe { }

class EsportsSafe extends CompetitorSafe {
    public String getGame() { return "Valorant"; }
}
