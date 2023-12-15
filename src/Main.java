import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(
                1993,6,6),
                new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(
                1996,6,6),
                new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        System.out.println("________________________________________");

        barsik.lifeCycle();

        System.out.println("-----------------------------------------");

        DuckDuck mrDuck = new DuckDuck("BigbabyDuck", LocalDate.of(
                2000,6,3),
                new ArrayList<>(), "bullet wound", "-");

        mrDuck.lifeCycleForDuck();

        System.out.println("------------------------------------------");

        System.out.println("Hello!, my name is Nemo!");

        Fish nemo = new Fish("Nemo", LocalDate.of(
                2011,3,5),
                new ArrayList<>(), "-", "-","Blue");

        nemo.lifeCycleForFish();
        System.out.println("My colour is " + nemo.getColour());
    }

}

//    String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner