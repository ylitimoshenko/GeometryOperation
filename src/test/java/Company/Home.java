package Company;

public class Home {

    int plosha;
    String name;

    public Home(int plosha, String name) {
        this.plosha = plosha;
        this.name = name;
    }

//    Home(int plosha, String name) {
//        System.out.println(a+b);
//        plosha = a;
//        name = b;
//
//    } Alt+Insert  create constructor





    public void  showHome() {
        System.out.println("Площа " + plosha +  " " + "назва = " + name);
    }
}
