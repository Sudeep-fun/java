public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is "+porsche.getModel());

        Account bobAccount = new Account();
        bobAccount.deposit(50.0);
        bobAccount.withdrawal(100.0);

        bobAccount.deposit(51.0);
        bobAccount.withdrawal(100.0);

        //Inheritance Programs
        Dog dog = new Dog("yorkie",1,1,8,20,2,4,1,10,20);
        dog.eat();
    }
}
