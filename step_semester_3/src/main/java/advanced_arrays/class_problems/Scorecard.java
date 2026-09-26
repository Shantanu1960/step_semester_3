package advanced_arrays.class_problems;

public class Scorecard {
    private final boolean[] results;
    private int answersRecorded;

    public Scorecard(int questionCount) {
        if (questionCount < 0) {
            throw new IllegalArgumentException("Question count cannot be negative");
        }

        this.results = new boolean[questionCount];
        this.answersRecorded = 0;
    }

    public void recordAnswer(boolean isCorrect) {
        if (answersRecorded == results.length) {
            System.out.println("Answer rejected: all questions have been recorded");
            return;
        }

        results[answersRecorded] = isCorrect;
        answersRecorded++;
    }

    public int getScore() {
        int score = 0;
        for (int index = 0; index < answersRecorded; index++) {
            if (results[index]) {
                score++;
            }
        }
        return score;
    }
}