import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.util.Arrays;

public class LocalDateTest {
  public static void main(String[] args) {
//date
    LocalDate ld1 = LocalDate.now();
    LocalDate ld2 = LocalDate.of(2014, 3,17);
    LocalDate ld3 = LocalDate.of(2022, Month.DECEMBER, 25);

    System.out.println(ld1);
    System.out.println(ld2);
    System.out.println(ld3);

    // invalid date
    //LocalDate invalidDate = LocalDate.of(2022, 13, 1);

    //times

    LocalTime lt1 = LocalTime.now();
    LocalTime lt2 = LocalTime.of(10,5);

    System.out.println(lt1);
    System.out.println(lt2);

    //dateTIme
    LocalDateTime ldt1 = LocalDateTime.now();
    LocalDateTime ldt2 = LocalDateTime.of(2022, 2,1,2,3);
    LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);

    System.out.println(ldt1);
    System.out.println(ldt2);
    System.out.println(ldt3);

    //month day
    MonthDay md = MonthDay.now();
    MonthDay md2 = MonthDay.of(7,8);
    LocalDate newLocalDate = md2.atYear(2022);

    System.out.println(md);
    System.out.println(md2);
    System.out.println(newLocalDate);

    YearMonth ym = YearMonth.now();
    LocalDate yearOfMonth = ym.atDay(8);

    System.out.println(ym);
    System.out.println(yearOfMonth);


  }
}
