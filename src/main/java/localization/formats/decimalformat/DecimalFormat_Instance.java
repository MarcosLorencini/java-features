package localization.formats.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormat_Instance {

    //Enquanto NumberFormat permite utilizar formatos predefinidos, DecimalFormat permite uma
    //personalização maior. Um exemplo de formato para o DecimalFormat é ###,###.###.
    //• # → preenche a posição com um número, ou omite se não houver nada.
    //• 0 → preenche a posição com um número, ou 0 se não houver nada.
    //• . → indica onde é a posição do separador decimal.
    //• , → indica onde é a posição do separador de grupos.

    public static void main(String[] args) {
        //É possível obter uma instância de DecimalFormat utilizando o construtor

        double d = 12345.67;

        // omite todas as posições vazias, utiliza separador a cada 3 casas
        DecimalFormat instance1 = new DecimalFormat("###,###.###");
        System.out.println("###,###.### " + instance1.format(d));

        // omite as posições vazias na parte decimal, utiliza separador a cada 3 casas
        DecimalFormat instance2 = new DecimalFormat("000,000.###");
        System.out.println("000,000.### " + instance2.format(d));

        // omite as posições vazias na parte inteira, utiliza separador a cada 3 casas
        DecimalFormat instance3 = new DecimalFormat("###,###.000");
        System.out.println("###,###.000 " + instance3.format(d));

        // apresenta todas as posições, utiliza separador a cada 3 casas
        DecimalFormat instance4 = new DecimalFormat("000,000.000");
        System.out.println("000,000.000: " + instance4.format(d));

        // omite todas as posições vazias, não utiliza separador
        DecimalFormat instance5 = new DecimalFormat("###.##");
        System.out.println("###.##: " + instance5.format(d));

        // apresenta todas as posições, não utiliza separador
        DecimalFormat instance6 = new DecimalFormat("000000.000");
        System.out.println("000000.000: " + instance6.format(d));

        // omite todas as posições vazias, não utiliza separador e não apresenta casas decimais
        DecimalFormat instance7 = new DecimalFormat("###");
        System.out.println("###: " + instance7.format(d));

        //###,###.###: 12.345,67
        //000,000.###: 012.345,67
        //###,###.000: 12.345,670
        //000,000.000: 012.345,670
        //###.##: 12345,67
        //000000.000: 012345,670
        //###: 12346

        //Estou executando o código onde o Locale padrão é pt_BR, por isso a saída no console apresenta
        //vírgulas para separar grupos e pontos para separar os decimais.








    }
}
