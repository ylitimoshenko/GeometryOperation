package Company;

public class Taxi {
    public int passagir;
    int hodka;
    public String name;
    public int kilkAvto;
    public int vmestimostPassagirov;

    public Taxi(int passagir, String name, int vmestimostPassagirov , int hodka, int kilkAvto) {
        this.name = name;
        this.passagir = passagir;
        this.hodka = hodka;
        this.kilkAvto = kilkAvto;
        this.vmestimostPassagirov = vmestimostPassagirov;
    }

    public int calculatePerevezenihPassagiriv() {
        if (passagir < 10){
            System.out.println("Вибачте служба ТАХІ не працює!");
        }else {
            System.out.println("Якщо кількість бажаючих пасажирів за ніч " + passagir + " потрібно " + kilkAvto  + " автомобілів." + " Їх буде перевезено за " + passagir/vmestimostPassagirov + " ходок.");
        }
        return  passagir/vmestimostPassagirov;
    }
}
