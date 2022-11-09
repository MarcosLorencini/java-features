package localization.resourcebundle;

import java.math.BigDecimal;
import java.util.ListResourceBundle;

//Ao utilizar classes Java, uma vantagem é poder armazenar valores que não sejam apenas
//String.

public class Text_fr_FR extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"ten", new BigDecimal("10")}
        };
    }
}
