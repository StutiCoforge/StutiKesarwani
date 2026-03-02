package assignment;

public abstract class ExamProcess {
    protected final Student student;
    protected String hallTicketNo;

    protected ExamProcess(Student student) {
        this.student = student;
    }

    // Template method; keep final if you want to lock the flow
    public final void runProcess() {
        printHeader();
        validateEligibility();
        allocateHallTicket();
        conductExam();
        int score = evaluate();
        publishResult(score);
    }

    // Make sure these are NOT final so subclasses can override
    protected abstract void conductExam();
    protected abstract int evaluate();

    // Common protected/final helpers
    protected final void validateEligibility() {
        if (student.getAttendancePercent() < UniversityRules.MIN_ATTENDANCE_PERCENT) {
            throw new IllegalStateException(
                "Attendance below " + UniversityRules.MIN_ATTENDANCE_PERCENT + "% for " + student.getName()
            );
        }
        System.out.println("Eligibility validated for " + student.getName());
    }

    protected final void allocateHallTicket() {
        hallTicketNo = UniversityRules.generateHallTicket(student.getStudentId());
        System.out.println("Hall Ticket Allocated: " + hallTicketNo);
    }

    protected final void publishResult(int score) {
        boolean passed = score >= UniversityRules.PASS_MARKS;
        System.out.println("Result for " + student.getName());
        System.out.println("   - Score: " + score + "/100");
        System.out.println("   - Status: " + (passed ? "PASS" : "FAIL")
                + " (Pass Marks: " + UniversityRules.PASS_MARKS + ")");
        System.out.println("   - University: " + UniversityRules.UNIVERSITY_CODE);
    }

    private void printHeader() {
        System.out.println("Exam: " + this.getClass().getSimpleName() + " | Student: " + student);
    }

    // Provide this so subclasses can call it
    protected static int clamp0to100(int val) {
        return Math.max(0, Math.min(100, val));
    }
}