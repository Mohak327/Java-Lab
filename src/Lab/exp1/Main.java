package Lab.exp1;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));

    }
}
