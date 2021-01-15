import java.util.*;

public class EmailApp {
    
    public static void main (String[] args) {
        Email email1 = new Email("Andy", "Jiang");
        
        email1.setAlternateEmail("12345678@gmail.com");
        
        System.out.println("----------------------------------------\n" 
        		+ email1.information());
    }
}
