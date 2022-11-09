package localization.timezones;

import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTime_Zones {

    //É possível recuperar todos os fusos horários disponíveis através da classe ZoneId.

    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for(String zoneId : availableZoneIds) {
            System.out.println(zoneId);

        }
    }

    //A lista do console irá apresentar todos os ZoneId disponíveis. O exemplo acima contempla
    //apenas parte dos ZoneId.
    //Além disso, existem muitos ZoneId duplicados, pois representam o mesmo fuso horário, como
    //por exemplo America/Sao_Paulo e Brazil/East.
}
