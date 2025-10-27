// Major.java
/**
 * Major класс: Мэргэжлийн мэдээллийг хадгалах класс
 * Мэргэжлийн код, нэрийг хадгална
 */
public class Major {
    public String code;    // Мэргэжлийн код (жишээ нь: CS)
    public String name;    // Мэргэжлийн нэр (жишээ нь: Computer Science)
    
    /**
     * Major классын конструктор
     * @param code Мэргэжлийн код
     * @param name Мэргэжлийн нэр
     */
    public Major(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    /**
     * Мэргэжлийн мэдээллийг хэвлэх метод
     * @return Мэргэжлийн мэдээлэл
     */
    @Override
    public String toString() {
        return code + " - " + name;
    }
}