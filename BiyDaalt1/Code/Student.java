// Student.java
import java.util.ArrayList;

/**
 * Student класс: Оюутны мэдээллийг хадгалах класс
 * Оюутны код, GPA, дуусгасан хичээлүүд, мэргэжлийн кодыг хадгална
 */
public class Student {
    public String code;                    // Оюутны код (жишээ нь: CS001)
    public float GPA;                      // Голч дунд (GPA)
    public ArrayList<LessonTaken> lessons; // Дуусгасан хичээлүүдийн жагсаалт
    public String majorCode;               // Мэргэжлийн код (оюутны кодын эхний 2 үсэг)
    
    /**
     * Student классын конструктор
     * @param code Оюутны код
     */
    public Student(String code) {
        this.code = code;
        this.lessons = new ArrayList<>();  // Хоосон хичээлийн жагсаалт үүсгэх
        this.majorCode = code.length() >= 2 ? code.substring(0, 2) : "XX";
    }
    
    /**
     * Оюутны GPA тооцоолох метод
     * GPA = (бүх хичээлийн (grade point × credit)) / (нийт credit)
     */
    public void calculateGPA() {
        if (lessons.isEmpty()) {
            GPA = 0.0f;
            return;
        }
        
        float totalGradePoints = 0.0f;  // Нийт grade point × credit
        float totalCredits = 0.0f;      // Нийт credit
        
        for (LessonTaken lesson : lessons) {
            totalGradePoints += lesson.gradePoint * lesson.learned.credit;
            totalCredits += lesson.learned.credit;
        }
        
        GPA = totalCredits > 0 ? totalGradePoints / totalCredits : 0.0f;
    }
    
    /**
     * Хэдэн "F" үнэлгээтэйг тоолох метод
     * @return F үнэлгээний тоо
     */
    public int getFCount() {
        int count = 0;
        for (LessonTaken lesson : lessons) {
            if ("F".equals(lesson.grade)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Оюутны мэдээллийг хэвлэх метод
     * @return Оюутны мэдээлэл
     */
    @Override
    public String toString() {
        return code + " - GPA: " + String.format("%.2f", GPA);
    }
}