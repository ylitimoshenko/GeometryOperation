package Company;

public class Phone {

        String number;
        String model;
        int weight;

        public Phone(String number, String model, int weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }

        public Phone() {

        }

        public void vivod(){
            System.out.println("Номер " + number);
            System.out.println("Модель телефона " + model);
            System.out.println("Вага телефона " + weight);
            System.out.println("\n");
        }

        public void receiveCall(String name){
            System.out.println("Телефонує " + name);
        }

        public String getNumber(){
            return number;
        }

        public void isNumberUkrainian() {
            if (getNumber().contains("+380"))
                System.out.println("З України");
        }

}
