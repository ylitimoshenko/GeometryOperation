package Company;

import org.testng.annotations.Test;

public class TestColegge {

    @Test
    public void testColegge() {
        Student victoriaTymoshenko = new Student("Victoria ", "Tymoshenko.", 16, "Kiev. ", 45.3);
        victoriaTymoshenko.printFullInfo();
        Student mariaKuzmuk = new Student("Maria ", "Kuzmuk.", 17, "Chernigiv. ", 47.5);
        mariaKuzmuk.printFullInfo();
        Student markOsipov = new Student("Mark ", "Osipov.", 17, "Lviv.", 48);
        markOsipov.printFullInfo();
        Student katyaRizhik = new Student("Katya ", "Rizhik.", 16, "Brovary.", 42.5);
        katyaRizhik.printFullInfo();
        Student ivanLuk = new Student("Ivan ", "Luk ", 18, "Irpin", 50);
        ivanLuk.printFullInfo();
    }
}



