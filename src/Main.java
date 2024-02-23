import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         /*Animal деген класс тузунуз жана бир метод кошунуз.
Анын 3 наследнигин тузунуз.

Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
чыгарыныз.
Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.

*/

        Animal animal1 = new Shark("akula1",10);
        Animal animal2 = new Shark("akula2",15);
        Animal animal3 = new Turtle("turtle1",5);
        Animal animal4 = new Turtle("turtle2",10);
        Animal animal5 = new Eagle("eagle1",2);
        Animal animal6 = new Eagle("eagle2",4);


        Animal[] animals = {animal1,animal2,animal3,animal4,animal5,animal6};


        System.out.println("instanceof");
        for (Animal animal : animals) {
            // 1 variant
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.getAttack();
                // 2 variant
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).getFly();
                // 3 variant
            } else if (animal instanceof Turtle turtle) {
                turtle.getSwim();
            }
        }

        System.out.println("\nget class");
        for (Animal animal : animals) {
            if (animal.getClass() == Shark.class) {
                ((Shark) animal).getAttack();
            } else if (animal.getClass() == Turtle.class) {
                ((Turtle) animal).getSwim();
            } else if (animal.getClass() == Eagle.class) {
                ((Eagle) animal).getFly();

            }
        }
        System.out.println("\n"+animal1.getClass());
        System.out.println(animal2.getClass());
        Animal [] sharks = {animal1,animal2};
        System.out.println(Arrays.toString(sharks));

        System.out.println(animal3.getClass());
        System.out.println(animal4.getClass());
        Animal[] turtles = {animal3,animal4};
        System.out.println(Arrays.toString(turtles));

        System.out.println(animal5.getClass());
        System.out.println(animal6.getClass());
        Animal [] eagles = {animal5,animal6};
        System.out.println(Arrays.toString(eagles));

    }
}