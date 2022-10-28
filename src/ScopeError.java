public class ScopeError {

    private int score;

    public ScopeError(int score) {
        this.score = score;
    }

    public String grade() {
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 60) {
            return "D";
        }
        if (score < 60) {
            return "F";
        }
        return "F";
    }
}
