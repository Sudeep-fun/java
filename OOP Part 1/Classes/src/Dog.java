public class Dog extends Animal{

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int size1, int weight1) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.size = size1;
        this.weight = weight1;
    }

    private int eyes;
    private int legs;
    private int tail;
    private int size;
    private int weight;

    @Override
    public void eat() {
        System.out.println("Dog eat() called");
        chew();
        super.eat();
    }
    public void chew(){
        System.out.println("dog chew() called");
    }
}
