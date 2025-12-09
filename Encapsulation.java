package workshop4;
public class Encapsulation {
    public static void main(String[] args) {

        NameEncap name = new NameEncap("Rakesh", "Raj");
        XXXCompetitorEncap c = new XXXCompetitorEncap(101, name, "Beginner", "Nepal");

        System.out.println("ID: " + c.getCompetitorID());
        System.out.println("Name: " + c.getName().getFirstName());
        System.out.println("Level: " + c.getLevel());
        System.out.println("Country: " + c.getCountry());
    }
}

class NameEncap {
    private final String firstName;
    private final String lastName;

    public NameEncap(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}

class XXXCompetitorEncap {
    private int competitorID;
    private NameEncap name;
    private String level;
    private String country;

    public XXXCompetitorEncap(int id, NameEncap name, String level, String country) {
        setCompetitorID(id);
        this.name = name;
        setLevel(level);
        this.country = country;
    }

    public int getCompetitorID() { return competitorID; }
    public NameEncap getName() { return name; }
    public String getLevel() { return level; }
    public String getCountry() { return country; }

    public void setCompetitorID(int id) {
        if (id < 0) throw new IllegalArgumentException("ID cannot be negative");
        this.competitorID = id;
    }

    public void setLevel(String level) {
        if (!level.equals("Beginner") &&
            !level.equals("Intermediate") &&
            !level.equals("Advanced"))
            throw new IllegalArgumentException("Invalid level");
        this.level = level;
    }
}

