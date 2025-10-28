import java.util.ArrayList;

public class Student {
    public String code;                  
    public float GPA;                     
    public ArrayList<LessonTaken> lessons;
    public String majorCode;            

    public Student(String code) {
        this.code = code;
        this.lessons = new ArrayList<>();  // Хоосон хичээлийн жагсаалт үүсгэх
        this.majorCode = code.length() >= 2 ? code.substring(0, 2) : "XX";
    }

    public void calculateGPA() {
        if (lessons.isEmpty()) {
            GPA = 0.0f;
            return;
        }
        
        float totalGradePoints = 0.0f;  
        float totalCredits = 0.0f;     
        
        for (LessonTaken lesson : lessons) {
            totalGradePoints += lesson.gradePoint * lesson.learned.credit;
            totalCredits += lesson.learned.credit;
        }
        
        GPA = totalCredits > 0 ? totalGradePoints / totalCredits : 0.0f;
    }

    public int getFCount() {
        int count = 0;
        for (LessonTaken lesson : lessons) {
            if ("F".equals(lesson.grade)) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        return code + " - GPA: " + String.format("%.2f", GPA);
    }
}
