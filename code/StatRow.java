public class StatRow {
    private int xover_id;
    private int run;
    private int generation;
    private double avg_fitness;
    private double best_fitness;
    private int[] schema_count;

    public StatRow(int xover_id, int run, int generation, double avg_fitness, double best_fitness,
            int[] schema_count) {
        this.xover_id = xover_id;
        this.run = run;
        this.generation = generation;
        this.avg_fitness = avg_fitness;
        this.best_fitness = best_fitness;
        this.schema_count = schema_count;
    }

    public String toString() {
        String s = xover_id + "," + run + "," + generation + "," + avg_fitness + "," + best_fitness;
        for (int i = 0; i < schema_count.length; i++) {
            s += "," + schema_count[i];
        }
        return s;
    }
}
