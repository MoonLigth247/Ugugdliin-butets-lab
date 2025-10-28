public class LessonTaken {
    public Subject learned;   
    public int score;         
    public String grade;      
    public float gradePoint;  
    
    public LessonTaken(Subject learned, int score) {
        this.learned = learned;
        this.score = score;
        calculateGrade();
    }

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
    
    public String toString() {
        return learned.code + " - " + score + " (" + grade + ")";
    }
}
