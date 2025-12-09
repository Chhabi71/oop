package workshop4;
public class Immutable{
    public static void main(String[] args) {

        NameImmutable n = new NameImmutable("Jack", "Bhattari");

        System.out.println(n.getFirstName());
        System.out.println(n.getLastName());
    }
}

final class NameImmutable {
    private final String firstName;
    private final String lastName;

    public NameImmutable(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}
