package assignment;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("STU1001", "Aarav Mehta", 82);
        ExamProcess lab = new LabPracticalExam(s1, 35, 40);
        lab.runProcess();
    }
}