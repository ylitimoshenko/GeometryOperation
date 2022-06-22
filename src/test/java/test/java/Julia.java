package test.java;

import org.testng.annotations.Test;

public class Julia {
    //Юля, цей текст перевіряє роботу джава
    @Test
    public void test(){
        System.out.println("Hello my dear student!");
        System.out.println(5+4+3);

        byte b = 125;
        short s = 5;
        int i  = 2;
        long j =3;

        boolean boo =false;
        char ch ='a';

        float f = 12.5f;/*для дробних чисел*/
        double doub = 12.5;/*для дробних чисел, але можна і цілі 12,0 або 12*/
        //унарний оператор
        doub ++;
        doub--;
        //бинарний оператор
        double muitiply = doub * 2;
        double summ = doub + 5;
        double divide = doub / 5;
        double ost = doub % 5;
        //тернарний оператор
        int a = 1>5 ? 1 : 0;




       //Щоб закоментувати рядок  Ctrl+/




    }
}
