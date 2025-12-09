package workshop4;
public class Polymorphism {
    public static void main(String[] args) {

        CompetitorPoly c1 = new BeginnerPoly();
        CompetitorPoly c2 = new IntermediatePoly();
        CompetitorPoly c3 = new AdvancedPoly();

        System.out.println("Beginner score: " + c1.getOverallScore());
        System.out.println("Intermediate score: " + c2.getOverallScore());
        System.out.println("Advanced score: " + c3.getOverallScore());

        // Overloading
        double[] scores = {80, 90, 100};
        System.out.println("Average: " + c1.getOverallScore(scores));
        System.out.println("Weighted: " + c1.getOverallScore(scores, 1.2));
    }
}

class CompetitorPoly {

    public double getOverallScore() { return 0; }

    public double getOverallScore(double[] scores) {
        double sum = 0;
        for (double s : scores) sum += s;
        return sum / scores.length;
    }

    public double getOverallScore(double[] scores, double weight) {
        return getOverallScore(scores) * weight;
    }
}

class BeginnerPoly extends CompetitorPoly {
    @Override public double getOverallScore() { return 50; }
}

class IntermediatePoly extends CompetitorPoly {
    @Override public double getOverallScore() { return 70; }
}

class AdvancedPoly extends CompetitorPoly {
    @Override public double getOverallScore() { return 90; }
}
