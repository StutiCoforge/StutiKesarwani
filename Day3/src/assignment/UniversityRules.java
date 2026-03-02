package assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class UniversityRules {
    public static final String UNIVERSITY_CODE = "UNI-2026";
    public static final int MIN_ATTENDANCE_PERCENT = 75;
    public static final int PASS_MARKS = 40;

    private static int hallTicketCounter = 10000;

    private UniversityRules() {}

    public static synchronized String generateHallTicket(String studentId) {
        hallTicketCounter++;
        String ts = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return UNIVERSITY_CODE + "-" + ts + "-" + studentId + "-" + hallTicketCounter;
    }
}