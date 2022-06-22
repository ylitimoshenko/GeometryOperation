package Company;

import org.testng.annotations.Test;

public class TestSasha {

    @Test
            public void testSasha(){

    String sasha = "Саша учит JAVA";
    for (int x = sasha.length() -1; x >= 0 ; x--){
        System.out.print(sasha.charAt(x));
    }
    }

    }

