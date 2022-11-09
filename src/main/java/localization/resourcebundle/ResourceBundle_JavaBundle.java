package localization.resourcebundle;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_JavaBundle {
    //busca a o valor na classe Text_fr_CA.java

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("Text", new Locale("fr", "CA"));

        System.out.println(bundle.getString("glass"));
    }
}
