package workshop4;

public class Downcasting {
    public static void main(String[] args) {

        CompetitorDown c = new AdvancedDown();

        ((AdvancedDown)c).extraTraining();
    }
}

class CompetitorDown { }

class AdvancedDown extends CompetitorDown {
    public void extraTraining() {
        System.out.println("Advanced competitor extra training!");
    }
}
