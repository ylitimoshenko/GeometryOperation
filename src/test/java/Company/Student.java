package Company;

public class Student {

    public Student(String name, String surname, int age, String city, double weight){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.weight = weight;

    }
    public  String name;
    public String surname;
    public int age;
    public String city;
    public double weight;

    public void printFullInfo(){
        System.out.println("My name is " + name + surname);
        System.out.println("I'm " + age + " years old.");
        System.out.println("I'm from " + city);
        System.out.println("My weight is " + weight + ".");
        System.out.println("_____________________");
    }

}

