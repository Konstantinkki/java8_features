import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
  public static void main(String[] args) {
    Period p1 = Period.of(1,1,1);
    System.out.println(p1);

    Period p2 = Period.ofDays(100);
    System.out.println(p2);

    LocalDate ld1 = LocalDate.of(2022,2,2);
    LocalDate ld2 = LocalDate.now();
    Period p3 = Period.between(ld1, ld2);
    System.out.println(p3);

    System.out.println(p3.getDays());

    long numOfDays = ChronoUnit.DAYS.between(ld1,ld2);
    System.out.println(numOfDays);


  }
}
