package assignment;


//ExamManagementDemo.java

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExamManagementDemo {
 public static void main(String[] args) {
     Student s1 = new Student("STU1001", "Aarav Mehta", 86);
     Student s2 = new Student("STU1002", "Dia Kapoor", 76);
     Student s3 = new Student("STU1003", "Kabir Rao", 62);
     Student s4 = new Student("STU1004", "Zara Khan", 58);

     ExamProcess midterm1 = new MidtermExam(s1, 48);
     ExamProcess midterm2 = new MidtermExam(s2, 35);

     ExamProcess lab1 = new LabPracticalExam(s3, 30, 25);
     ExamProcess lab2 = new LabPracticalExam(s4, 40, 20);

     ExamProcess final1 = new FinalSemesterExam(s1, 60, 25, 10);
     ExamProcess final2 = new FinalSemesterExam(s3, 30, 10, 5);

     runSafely(midterm1);
     runSafely(midterm2);
     runSafely(lab1);
     runSafely(lab2);
     runSafely(final1);
     runSafely(final2);
 }

 private static void runSafely(ExamProcess exam) {
     System.out.println();
     System.out.println("================================");
     try {
         exam.runProcess();
     } catch (IllegalStateException ex) {
         System.out.println("Process aborted: " + ex.getMessage());
     }
 }
}