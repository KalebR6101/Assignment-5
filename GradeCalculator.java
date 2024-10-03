import java.util.HashMap;
import java.util.Map;

public class GradeCalculator {

    private static HashMap<String, Integer > grades = new HashMap<>();

    static{
        grades.put("Outline", 100);
        grades.put("Quiz1", 10);
        grades.put("Quiz2", 10);
        grades.put("Quiz3", 8);
        grades.put("Quiz4", 8);
        grades.put("Quiz5", 12);
        grades.put("Assignment1", 30);
        grades.put("Assignment2", 30);
        grades.put("Assignment3", 30);
        grades.put("Assignment4", 24);
        grades.put("Assignment5", 18);
    }


    public static int calculateTotalPoints() {
        int total = 0;
        for (int points : grades.values()) {
            total += points;
        }
        return total;
    }

    // [4 pts] Function to calculate grade based on percentage
    public static String getLetterGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // [4 pts] Function to get the current grade for quizzes only
    public static String getQuizAverageGrade() {
        int quizPoints = 0;
        int quizMax = 0;
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getKey().startsWith("Quiz")) {
                quizPoints += entry.getValue();
                quizMax += 10; // Each quiz is out of 10 points
            }
        }
        double percentage = ((double) quizPoints / quizMax) * 100;
        return String.format("%.2f%% --> %s", percentage, getLetterGrade(percentage));
    }

    // [4 pts] Function to get the current grade for assignments only
    public static String getAssignmentAverageGrade() {
        int assignmentPoints = 0;
        int assignmentMax = 0;
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getKey().startsWith("Assignment")) {
                assignmentPoints += entry.getValue();
                assignmentMax += 30; // Assuming each assignment is out of 30 points
            }
        }
        double percentage = ((double) assignmentPoints / assignmentMax) * 100;
        return String.format("%.2f%% --> %s", percentage, getLetterGrade(percentage));
    }

    // [4 pts] Function to calculate the overall grade
    public static String calculateOverallGrade() {
        int totalPoints = calculateTotalPoints();
        int maxPoints = 100 + (5 * 10) + (3 * 30) + 24 + 18; // Outline + quizzes + assignments
        double percentage = ((double) totalPoints / maxPoints) * 100;
        return String.format("%.2f%% --> %s", percentage, getLetterGrade(percentage));
    }

    public static void main(String[] args) {
        // [4 pts] Printing out all values correctly
        System.out.println("Quiz Average: " + getQuizAverageGrade());
        System.out.println("Assignment Average: " + getAssignmentAverageGrade());
        System.out.println("Total Points: " + calculateTotalPoints() + " pts");
        System.out.println("Overall Grade: " + calculateOverallGrade());
    }


}
