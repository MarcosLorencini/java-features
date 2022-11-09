package localization.datetime.duration;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Duration_Compatibility {

    //É possível somar uma Duration a um Instant, LocalTime ou LocalDateTime.

    public static void main(String[] args) {
        Duration perid = Duration.ofHours(2);
        System.out.println("Duration: " + perid);

        Instant instant = Instant.ofEpochSecond(1558962061L);
        System.out.println("\nInstant: " + instant);
        System.out.println("Instant + Duration: " + instant.plus(perid));

        LocalTime localTime = LocalTime.of(12,5,2);
        System.out.println("\nLocalTime: " + localTime);
        System.out.println("LocalTime + Duration: " + localTime.plus(perid));

        LocalDateTime localDateTime = LocalDateTime.of(2018,05,27,13,1,1);
        System.out.println("\nLocalDateTime: " + localDateTime);
        System.out.println("LocalDateTime + Duration: "+localDateTime.plus(perid));


    }


}
