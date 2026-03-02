package assignment;

class LabPracticalExam extends ExamProcess {
    private final int labScore;
    private final int vivaScore;

    public LabPracticalExam(Student student, int labScore, int vivaScore) {
        super(student);
        this.labScore = clamp0to100(labScore);
        this.vivaScore = clamp0to100(vivaScore);
    }

    @Override
    protected void conductExam() {
        System.out.println("Conducting Lab Practical: Safety check, apparatus setup, viva scheduling.");
    }

    @Override
    protected int evaluate() {
        System.out.println("Evaluating Lab Practical: Aggregation of lab and viva scores.");
        return clamp0to100(labScore + vivaScore);
    }
}