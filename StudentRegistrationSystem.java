import java.io.*;
import java.util.*;
public class StudentRegistrationSystem {
    
    /**
     * Гол метод - програмыг эхлүүлнэ
     * @param args команд мөрийн параметрүүд
     */
    public static void main(String[] args) {
        System.out.println("=".repeat(70));
        System.out.println("CS203 - ОЮУТНЫ БҮРТГЭЛИЙН СИСТЕМ");
        System.out.println("Бие даалт №1 - Шугаман жагсаалтын практик хэрэглээ");
        System.out.println("=".repeat(70));
        
        // Бүртгэлийн системийн объект үүсгэх
        Registration registration = new Registration();
        
        // Файлуудыг унших
        System.out.println("\nФАЙЛУУДЫГ УНШИЖ БАЙНА...");
        registration.readSubjects("Subjects.txt");
        registration.readMajors("Professions.txt");
        registration.readExams("Exams.txt");
        
        // Цэс харуулах, хэрэглэгчийн сонголтыг боловсруулах
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            displayMenu();
            System.out.print("Сонголтоо оруулна уу (0-7): ");
            
            try {
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
                    case 7:
                        registration.displaySystemStatistics();
                        break;
                    case 0:
                        running = false;
                        System.out.println("\nПрограм амжилттай дууслаа. Баяртай!");
                        break;
                    default:
                        System.out.println("Буруу сонголт! 0-7 хооронд тоо оруулна уу.");
                }
                
                // Хэрэглэгч дараагийн үйлдэлд шилжихэд хүрэх боломж олгох
                if (running && choice != 0) {
                    System.out.println("\nЦэс рүү буцахын тулд ENTER дарна уу...");
                    scanner.nextLine(); // Buffer цэвэрлэх
                    scanner.nextLine(); // Хүсэлтийг хүлээх
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Алдаа: Зөвхөн тоо оруулна уу!");
                scanner.next(); // Буруу оролтыг цэвэрлэх
            }
        }
        
        scanner.close();
    }
    
    /**
     * Цэсийг дэлгэцэнд харуулах туслах метод
     */
    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ҮНДСЭН ЦЭС");
        System.out.println("=".repeat(50));
        System.out.println("1. Нийт хичээлүүдийн жагсаалт");
        System.out.println("2. Нийт мэргэжлүүдийн жагсаалт");
        System.out.println("3. Нийт оюутны дундаж голч дүн");
        System.out.println("4. 3 ба түүнээс дээш 'F' үнэлгээтэй оюутнууд");
        System.out.println("5. Хичээл бүрээр оюутнуудын дүнгийн жагсаалт");
        System.out.println("6. Мэргэжил бүрээр оюутнуудын дүнгийн жагсаалт");
        System.out.println("7. Системийн статистик");
        System.out.println("0. Гарах");
        System.out.println("=".repeat(50));
    }
}