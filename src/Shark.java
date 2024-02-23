public class Shark extends Animal{
    public Shark() {
    }

    public Shark(String name, int age) {
        super(name, age);
    }


    public void getAttack() {
        System.out.println("Shark attack");
    }

    @Override
    public String toString() {
        return "Shark  " + super.toString();
    }
}
