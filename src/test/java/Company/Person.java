package Company;

public class Person {

    String fullName;
    int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void personMove() {
        System.out.println("Її звати " + fullName  + " їй " + age + " років. Рухається");
    }

    public void personTalk() {
        System.out.println("Її звати " + fullName  + " їй " + age + " років. Розмовляє");
    }
}
