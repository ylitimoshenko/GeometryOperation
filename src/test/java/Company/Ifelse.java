package Company;

import org.testng.annotations.Test;
public class Ifelse {


    @Test
            public void ifelse(){
    String hey = "пони катает детей";
            for(int x = hey.length()-1; x>=0 ;x--) {
                System.out.println(hey.charAt(x));
            }
}
}