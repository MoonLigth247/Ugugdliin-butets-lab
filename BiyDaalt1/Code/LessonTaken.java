// LessonTaken.java
/**
 * LessonTaken класс: Оюутны дуусгасан хичээлийн мэдээллийг хадгалах класс
 * Хичээл, оноо, үнэлгээ, grade point-ыг хадгална
 */
public class LessonTaken {
    public Subject learned;    // Дуусгасан хичээл
    public int score;          // Шалгалтын оноо (0-100)
    public String grade;       // Үнэлгээ (A, B, C, D, F)
    public float gradePoint;   // Grade point (4.0, 3.7, ... 0.0)
    
    /**
     * LessonTaken классын конструктор
     * @param learned Дуусгасан хичээл
     * @param score Шалгалтын оноо
     */
    public LessonTaken(Subject learned, int score) {
        this.learned = learned;
        this.score = score;
        calculateGrade();  // Оноогоор үнэлгээ тооцоолох
    }
    
    /**
     * Оноогоор үнэлгээ болон grade point тооцоолох хувийн метод
     * 95-100: A (4.0), 90-94: A- (3.7), 85-89: B+ (3.3), 80-84: B (3.0)
     * 75-79: B- (2.7), 70-74: C+ (2.3), 65-69: C (2.0), 60-64: C- (1.7)
     * 55-59: D+ (1.3), 50-54: D (1.0), 0-49: F (0.0)
     */
    private void calculateGrade() {
        if (score >= 95) { grade = "A"; gradePoint = 4.0f; }
        else if (score >= 90) { grade = "A-"; gradePoint = 3.7f; }
        else if (score >= 85) { grade = "B+"; gradePoint = 3.3f; }
        else if (score >= 80) { grade = "B"; gradePoint = 3.0f; }
        else if (score >= 75) { grade = "B-"; gradePoint = 2.7f; }
        else if (score >= 70) { grade = "C+"; gradePoint = 2.3f; }
        else if (score >= 65) { grade = "C"; gradePoint = 2.0f; }
        else if (score >= 60) { grade = "C-"; gradePoint = 1.7f; }
        else if (score >= 55) { grade = "D+"; gradePoint = 1.3f; }
        else if (score >= 50) { grade = "D"; gradePoint = 1.0f; }
        else { grade = "F"; gradePoint = 0.0f; }
    }
    
    /**
     * Дуусгасан хичээлийн мэдээллийг хэвлэх метод
     * @return Хичээлийн дүнгийн мэдээлэл
     */
    @Override
    public String toString() {
        return learned.code + " - " + score + " (" + grade + ")";
    }
}