import java.util.Scanner;

public class StudentRegistrationSystem {

    public static void main(String[] args) {
        Registration registration = new Registration();
        
        registration.readSubjects("Subjects.txt");
        registration.readMajors("Professions.txt");
        registration.readExams("Exams.txt");
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== ОЮУТНЫ БҮРТГЭЛИЙН СИСТЕМ ===");
            System.out.println("1. Нийт хичээлүүдийн жагсаалт");
            System.out.println("2. Нийт мэргэжлүүдийн жагсаалт");
            System.out.println("3. Нийт оюутны дундаж голч дүн");
            System.out.println("4. 3 ба түүнээс дээш 'F' үнэлгээтэй оюутнууд");
            System.out.println("5. Хичээл бүрээр оюутнуудын дүнгийн жагсаалт");
            System.out.println("6. Мэргэжил бүрээр оюутнуудын дүнгийн жагсаалт");
            System.out.println("0. Гарах");
            System.out.print("Сонголтоо оруулна уу: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    registration.displayAllSubjects();
                    break;
                case 2:
                    registration.displayAllMajors();
                    break;
                case 3:
                    registration.displayAllStudentsGPA();
                    break;
                case 4:
                    registration.displayStudentsWith3OrMoreF();
                    break;
                case 5:
                    registration.displayScoresBySubject();
                    break;
                case 6:
                    registration.displayScoresByMajor();
                    break;
                case 0:
                    running = false;
                    System.out.println("Програм дууслаа. Баяртай!");
                    break;
                default:
                    System.out.println("Буруу сонголт! Дахин оролдоно уу.");
            }
        }
        
        scanner.close();
    }
}
