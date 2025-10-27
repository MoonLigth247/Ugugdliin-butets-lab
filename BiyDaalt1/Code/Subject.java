// Subject.java
/**
 * Subject класс: Хичээлийн мэдээллийг хадгалах класс
 * Хичээлийн код, нэр, кредит зэрэг мэдээллийг хадгална
 */
public class Subject {
    public String code;    // Хичээлийн код (жишээ нь: CS101)
    public String name;    // Хичээлийн нэр (жишээ нь: Computer Programming)
    public float credit;   // Хичээлийн кредит (жишээ нь: 3.0)
    
    /**
     * Subject классын конструктор
     * @param code Хичээлийн код
     * @param name Хичээлийн нэр
     * @param credit Хичээлийн кредит
     */
    public Subject(String code, String name, float credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }
    
    /**
     * Хичээлийн мэдээллийг хэвлэх метод
     * @return Хичээлийн мэдээлэл
     */
    @Override
    public String toString() {
        return code + " - " + name + " (" + credit + " credit)";
    }
}