package Company;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {


    int stroberry = 5;
    int price = 35;
    int money = 250;

    @Test
    public void testCalculator() {
        dilenna(money, price);
        mnozenna(stroberry, price);
        ostatokVidDilenna(money, price);
        riznica(money, price);
    }

    public void dilenna(int money, int price){
        System.out.println(money / price);
    }
    public void mnozenna(int stroberry, int price){
        System.out.println(stroberry * price);
    }
    public void ostatokVidDilenna(int money, int price){
        System.out.println(money % price);
    }
    public void riznica(int money, int price){
        System.out.println(money - price);
    }


    @Test
    public void checkSuma() {
        Assert.assertTrue(kvadrat(2) == 4);
        Assert.assertTrue(kvadrat(12) == 144);
        Assert.assertTrue(suma(15) == 30);
        Assert.assertTrue(suma(33) == 66);

    }

    public int kvadrat(int b) {
        return b * b;
    }

    public int suma(int num) {
        return num + num;
    }
    //D/Z площа прямокутника, круга, квадрата, обєм куба,довжина круга, сума трьох чисел


    @Test
    public void checkKrug() {
        Assert.assertFalse(plozcaKryga(16)==67);
    }

    public double plozcaKryga(double radius) {
        System.out.println("площа круга");
        System.out.println("площа круга" + radius);
        return 3.14 * (radius*radius);
    }
}

//Цикли

