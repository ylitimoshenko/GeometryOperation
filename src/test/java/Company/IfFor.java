package Company;

import org.testng.annotations.Test;

public class IfFor {

    @Test
    public void testIfElse() {

        int password = 12345;

        System.out.println("Впустить в систему");

        if (password == 123456) {
            System.out.println("Впустить в систему как админ");
        } else if (password != 123456) {
            System.out.println("false");
        }

        System.out.println("Не впустить в систему");

        System.out.println("Вы не администратор");
    }

    @Test
    public void test2IfElse() {
        int a = 10;
        int b = 11;

        if (a == b) {
            System.out.println("Равно!");
        } else {
            System.out.println("Не равно!!");
        }
    }

    @Test
    public void test() {
        ravno(10, 11, false, 6.11);
        ravno(8, 3, true, 3.75);
        ravno(9, 12, false, 5.17);
    }

    public void ravno(int a, int b, boolean b1, double d) {
        if (a == b) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }

    @Test
    public void testFor() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void testFor2() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
    }

    @Test
    public void testFor3() {
        for (int i = 0; i < 10; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void testFor4() {
        for (int i = 0; i < 10; i += 2) {
            if (5 > i && i == 8) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void testFor5() {
        for (int i = 0; i < 10; i += 2) {
            if (5 > i || i == 8) {
                System.out.println(i);
            }
        }
    }

    @Test
    public void testFor6() {
        for (int i = 0; i < 10; i += 2) {
            if (i == 7) {
                System.out.println(i);
                break;
            }
        }
    }

    @Test
    public void testFor7() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
            if (i == 6) {
                System.out.println("break");
                break;
            }
        }
    }

    @Test
    public void testFor8() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 6) {
                continue;
            }
            System.out.println("look");
            System.out.println(i);
        }
    }

    @Test
    public void testFor9() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }

    @Test
    public void testFor10() {
        for (int i = 5; i >= 1; i--)
            System.out.println(i);
    }

    @Test
    public void testFor11() {
        for (int i = 1; i <= 10; i++)
            System.out.println("3*" + i + "=" + i * 3);
    }

}


