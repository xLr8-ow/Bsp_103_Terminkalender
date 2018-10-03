
import java.time.LocalDateTime;

public class Appointment {

    private LocalDateTime date;

    private String text;

    public Appointment(LocalDateTime date, String text) {
        this.date = date;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDate() {
        return date;
    }

   
}
