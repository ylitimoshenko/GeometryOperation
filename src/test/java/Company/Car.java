package Company;

public class Car {

    String color;
    int tools;
    String marka;
    int passagir;
    int obemBakaTopliva;

    public Car(String color, int tools, String marka, int passagir, int obemBakaTopliva) {
        this.color = color;
        this.tools = tools;
        this.marka = marka;
        this.passagir = passagir;
        this.obemBakaTopliva = obemBakaTopliva;
    }

    public Car(String marka,int obemBakaTopliva) {
        this.marka = marka;
        this.obemBakaTopliva = obemBakaTopliva;
    }

    public Car() {

    }




    public void showCar() {
        System.out.println("Этот автомобиль марки " + marka + " цвет " + color + "," + " обьем бака для топлива " + obemBakaTopliva + "," + " обем двигателя "+ tools + " количество пасажиров" + passagir);
    }

}
