
package dateapis;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


public class DateApis {

  
  public static void main(String[] args) {
    /*LocalDate date = LocalDate.of(2018, Month.JULY, 29);
    LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
    System.out.println(nextWed);
    YearMonth date1 = YearMonth.of(2016,Month.FEBRUARY);
    System.out.println(date1 + " " + date1.lengthOfMonth());
    LocalDate date2 = LocalDate.now();
    System.out.println(date2);
    MonthDay day = MonthDay.of(Month.FEBRUARY,29);
    System.out.println(day.isValidYear(2019));
    System.out.println(Year.isLeap(2017));
    LocalTime time = LocalTime.now();
    System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    System.out.println(LocalDateTime.now());
    System.out.println(LocalDateTime.now().plusMonths(6));
    System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));*/
    /*Set<String> allZones = ZoneId.getAvailableZoneIds();
    LocalDateTime dt = LocalDateTime.now();

    // Create a List using the set of zones and sort it.
    List<String> zoneList = new ArrayList<String>(allZones);
    Collections.sort(zoneList);



    for (String s : zoneList) {
        ZoneId zone = ZoneId.of(s);
        ZonedDateTime zdt = dt.atZone(zone);
        ZoneOffset offset = zdt.getOffset();
        int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
        String out = String.format("%35s %10s  %n", zone, offset);

    // Write only time zones that do not have a whole hour offset
    // to standard out.
    if (secondsOfHour != 0) {
        System.out.printf(out);
    }
    
}*/
    /*Instant timestamp = Instant.now();
    System.out.println(timestamp);
    System.out.println(Instant.MIN);
    System.out.println(Instant.MAX);*/
    
    
   
    try{
    DateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
   
    System.out.println(formatter.parse("28.08.1978"));
    }catch(Exception e)
    {
      
    }
    
  }
  
}
