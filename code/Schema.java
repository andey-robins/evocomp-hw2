public class Schema {
    private String pattern;
    private int score;

    public Schema(String spatt, int score) {
        this.pattern = spatt;
        this.score = score;
    }

    public int ScoreString(String s) {
        // Note: We don't check the lengths because the problem is only being used
        // with constant length patterns/schema

        for (int i = 0; i < s.length(); i++) {
            if (this.pattern.charAt(i) != '*' && s.charAt(i) != this.pattern.charAt(i)) {
                return 0;
            }
        }
        return this.score;
    }
}
