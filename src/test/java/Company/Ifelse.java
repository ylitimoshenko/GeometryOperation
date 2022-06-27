package Company;

import org.testng.annotations.Test;

import java.util.Locale;

public class Ifelse {


    @Test
    public void ifelse() {
        String hey = "пони катает детей";
        for (int x = hey.length() - 1; x >= 0; x--) {
            System.out.println(hey.charAt(x));
        }
    }
    @Test
    public void stringLength() {
        String hey = "пони катает детей";
        for (int x = 0; x <= hey.length() - 1; x++) {
            System.out.println(hey.charAt(x));
        }
    }

    @Test
    public void polindrom(){
        String say = "дід";
        for (int x = 0; x <= say.length() -1; x++){
            System.out.println(say.charAt(x));
        }
    }
}