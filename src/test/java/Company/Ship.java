package Company;

public class Ship {
    public int speed;
    public int zapasHoda;
    public int gruzz;
    public int hours;
    public String name;


    public  Ship(int speed, int zapasHoda, int gruzz, int hours, String name){
        this.speed = speed;
        this.zapasHoda = zapasHoda;
        this.gruzz = gruzz;
        this.name = name;
        this.hours = hours;
    }
    public double  calcDistanceWeCanGoForFiveHour() {
        if (zapasHoda < 5){
            System.out.println("Братішка не газуй бо не допливем");
        }else {
            System.out.println("При гружонности " + gruzz +" тонн, корабль пройде " + hours * (speed - speed * ((double) gruzz / 100)) + "км");
        }
        return  hours * (speed - speed * ((double) gruzz / 100));

    }
}
