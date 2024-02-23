public class Turtle extends Animal{
    public Turtle() {
    }

    public Turtle(String name, int age) {
        super(name, age);
    }


    public void getSwim() {
        System.out.println("Turtle swim");
    }

    @Override
    public String toString() {
        return "Turtle  " + super.toString();
    }
}
