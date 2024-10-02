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
    

}
