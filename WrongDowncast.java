package workshop4;
public class WrongDowncast {
    public static void main(String[] args) {

        CompetitorWrong c = new ArcheryWrong();

        try {
            EsportsWrong e = (EsportsWrong)c; 
        } catch (ClassCastException ex) {
            System.out.println("Error: Cannot cast Archery to Esports!");
        }
    }
}

class CompetitorWrong { }
class ArcheryWrong extends CompetitorWrong { }
class EsportsWrong extends CompetitorWrong { }
