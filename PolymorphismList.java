package workshop4;
import java.util.ArrayList;

public class PolymorphismList {
    public static void main(String[] args) {

        ArrayList<CompetitorList> competitors = new ArrayList<>();

        competitors.add(new ArcheryList());
        competitors.add(new EsportsList());
        competitors.add(new ShootingList());

        for (CompetitorList c : competitors)
            System.out.println(c.getDetails());
    }
}

class CompetitorList {
    public String getDetails() { return "Generic Competitor"; }
}

class ArcheryList extends CompetitorList {
    @Override public String getDetails() { return "Archery Competitor"; }
}

class EsportsList extends CompetitorList {
    @Override public String getDetails() { return "Esports Competitor"; }
}

class ShootingList extends CompetitorList {
    @Override public String getDetails() { return "Shooting Competitor"; }
}
