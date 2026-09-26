package advanced_arrays.class_problems;

public class q2 {

    public static void main(String[] args) {
        Scorecard scorecard = new Scorecard(4);

        scorecard.recordAnswer(true);
        scorecard.recordAnswer(true);
        scorecard.recordAnswer(false);
        scorecard.recordAnswer(true);

        System.out.println("Score: " + scorecard.getScore());
    }
}