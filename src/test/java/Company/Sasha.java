package Company;

import org.testng.annotations.Test;

public class Sasha {

    @Test
    public void sasha() {
        String sasha = "Саша учит JAVA";
        for (int x = sasha.length() - 1; x >= 0; x--) {
            System.out.println(sasha.charAt(x));
        }
    }
}