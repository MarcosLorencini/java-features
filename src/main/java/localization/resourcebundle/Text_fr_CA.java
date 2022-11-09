package localization.resourcebundle;

import java.util.ListResourceBundle;

//O resource bundle também pode ser uma classe Java.
public class Text_fr_CA extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {"pen", "stylo"},
                {"glass", "verre"},
                {"keyboard", "clavier"}
        };
    }
}
