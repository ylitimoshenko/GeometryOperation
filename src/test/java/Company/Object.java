package Company;

import org.testng.annotations.Test;

public class Object {

    @Test
    public void test() {

        Home home = new Home(45, "Калинка");
        home.showHome();

        Home home2 = new Home(15, "Горобинка");
        home2.showHome();
    }

    @Test
    public void car() {
        Car car = new Car("red",  2, "BMW" , 4, 54);
        car.showCar();

        Car car1 = new Car("Pegout", 43);
        car1.showCar();

        Car car2 = new Car();
        car2.showCar();

    }

    @Test
    public void testPerson(){
        Person person = new Person("Оксана",13);
        person.personMove();
        person.personTalk();

        Person person2 = new Person("Юлія",26);
        person2.personMove();
        person2.personTalk();

        Person person3 = new Person();
        person3.personMove();
        person3.personTalk();
    }


    @Test
    public void testPhone() {
        Phone phone = new Phone("+380952090268", " Xiaomi", 98);
        phone.vivod();
        phone.receiveCall("Степан");
        phone.isNumberUkrainian();

        Phone phone1 = new Phone("+380931234567", "Samsung");
        phone1.vivod();
        phone1.receiveCall("Микола");
        phone1.isNumberUkrainian();

        Phone phone2 = new Phone();
        phone2.vivod();
        phone2.receiveCall("Остап");
    }

    @Test
    public void checkZapasHoda(){
        double km =250.0;

        Ship beda = new Ship(30,5,95, 7, "pobeda");
        km = km - beda.calcDistanceWeCanGoForFiveHour();

        Ship pobeda = new Ship(70, 200, 45, 6, "beda");
        if (km > 0) {
            pobeda.calcDistanceWeCanGoForFiveHour();
        }


        Ship raketa = new Ship(80, 300, 35, 3, "Raketa");
        if (km > 0) {
            raketa.calcDistanceWeCanGoForFiveHour();
        }

        Ship galera = new Ship(50, 300, 20, 4, "Galera");
        if (km > 0) {
            galera.calcDistanceWeCanGoForFiveHour();
        }
    }

    @Test
    public void perevezennaPasagiriv() {
        Taxi lanos = new Taxi(78, "Lanos", 3, 6, 5);
        lanos.calculatePerevezenihPassagiriv();

        Taxi bmw = new Taxi(12, "BMW", 3, 6, 2);
        bmw.calculatePerevezenihPassagiriv();

        Taxi mersedes = new Taxi(9, "Mersedes", 4, 4, 7);
        mersedes.calculatePerevezenihPassagiriv();

        Taxi pegout = new Taxi(28, "Pegout", 6, 7, 3);
        pegout.calculatePerevezenihPassagiriv();

    }


}

