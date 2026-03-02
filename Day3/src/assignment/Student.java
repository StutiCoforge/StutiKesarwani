package assignment;


public class Student {
    private final String studentId;
    private final String name;
    private final int attendancePercent;

    public Student(String studentId, String name, int attendancePercent) {
        this.studentId = studentId;
        this.name = name;
        this.attendancePercent = attendancePercent;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAttendancePercent() { return attendancePercent; }

    @Override
    public String toString() {
        return name + " (" + studentId + "), Attendance: " + attendancePercent + "%";
    }
}