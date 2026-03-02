package assignment;

class FinalSemesterExam extends ExamProcess {
    private final int theory;
    private final int practical;
    private final int internal;
 
    public FinalSemesterExam(Student student, int theory, int practical, int internal) {
        super(student);
        this.theory = clamp0to100(theory);
        this.practical = clamp0to100(practical);
        this.internal = clamp0to100(internal);
    }
 
    @Override
    protected void conductExam() {
        System.out.println("Conducting Final Semester Exam: Centralized schedule, external invigilation.");
    }
 
    @Override
    protected int evaluate() {
        System.out.println("Evaluating Final Semester: Aggregating theory, practical, and internal.");
        int total = theory + practical + internal;
        return clamp0to100(total);
    }
}