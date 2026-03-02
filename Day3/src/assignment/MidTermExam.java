package assignment;

class MidtermExam extends ExamProcess {
    private final int marksObtained;
 
    public MidtermExam(Student student, int marksObtained) {
        super(student);
        this.marksObtained = clamp0to100(marksObtained);
    }
 
    @Override
    protected void conductExam() {
        System.out.println("Conducting Midterm Exam: Written test, duration 2 hours.");
    }
 
    @Override
    protected int evaluate() {
        System.out.println("Evaluating Midterm: Key-based marking by single evaluator.");
        return marksObtained;
    }
}
 