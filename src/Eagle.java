public class Eagle extends Animal{
    public Eagle() {
    }

    public Eagle(String name, int age) {
        super(name, age);
    }


    public void getFly() {
        System.out.println("Eagle fly");
    }

    @Override
    public String toString() {
        return "Eagle " + super.toString();
    }
}
