package workshop4;
public class Upcasting {
    public static void main(String[] args) {

        CompetitorUp c = new AdvancedUp(); 

        System.out.println("Score: " + c.getScore());
    }
}

class CompetitorUp {
    public double getScore() { return 0; }
}

class AdvancedUp extends CompetitorUp {
    @Override
    public double getScore() { return 95; }
}
