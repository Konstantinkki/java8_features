import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatting {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    String formatted = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);

    System.out.println(formatted);

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
    System.out.println(dtf.format(ldt));

    String formatStyleDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);

    System.out.println(formatStyleDate);

  }
}
