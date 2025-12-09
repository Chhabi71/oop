package workshop4;
public class StaticAndFinal {
    public static void main(String[] args) {

        CompetitorFinal c = new CompetitorFinal(50);
        System.out.println("ID: " + c.getId());

        RulesFinal r = new RulesFinal();
        r.displayRules(); 
    }
}

class CompetitorFinal {
    private final int id;

    public CompetitorFinal(int id) {
        this.id = id;
    }

    public int getId() { return id; }
}

class RulesFinal {
    public final void displayRules() {
        System.out.println("1. Follow the rules.");
        System.out.println("2. Judges’ decisions are final.");
    }
}
