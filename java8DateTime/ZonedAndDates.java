import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZonedAndDates {
  public static void main(String[] args) {

/*    for(String zoneId : ZoneId.getAvailableZoneIds()){
     // System.out.println("zone id = "+zoneId);
      ZoneId zoneId1 = ZoneId.of(zoneId);
      String displayName = zoneId1.getDisplayName(TextStyle.FULL, Locale.US);
      System.out.println(zoneId1+" : "+displayName);
    }*/

    ZoneId zoneId = ZoneId.of("US/Pacific");
    LocalDateTime ldt = LocalDateTime.now();
    ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId);
    System.out.println(zdt);

    ZonedDateTime zdt2 = ldt.atZone(zoneId);
    ZonedDateTime zdt3 = ZonedDateTime.now();
    System.out.println(zdt3);
    System.out.println(zdt3.getZone());


  }
}
