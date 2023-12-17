import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(
                1993,6,6),
                new ArrayList<>(), "Chumka", "Boss", 4);

        DuckDuck mrDuck = new DuckDuck("BigbabyDuck", LocalDate.of(
                2000,6,3),
                new ArrayList<>(), "bullet wound", "-");

        Eagle eagle = new Eagle("Kesha", LocalDate.of(
                1996,6,6),
                new ArrayList<>(), "Chumka", "Boss");

        Fish nemo = new Fish("Nemo", LocalDate.of(
                2011,3,5),
                new ArrayList<>(), "-", "-","Blue");

        Dog tuzik = new Dog("Tuzik", LocalDate.of(2019,12,24),
                new ArrayList<>(),"_", "Djon", 12.3);

        Snake zzz = new Snake("Zzz", LocalDate.of(2023,01,24),
                new ArrayList<>(),  "-", "Vera", "strong");

        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        animals.add(nemo);
        animals.add(tuzik);
        animals.add(zzz);




        System.out.println("________________________________________");

        barsik.lifeCycle();

        System.out.println("-----------------------------------------");

        System.out.println(mrDuck);
        mrDuck.lifeCycle();

        System.out.println("------------------------------------------");
        System.out.println(nemo);

        System.out.println("Hello!, my name is Nemo!");

        nemo.lifeCycle();

        System.out.println("My colour is " + nemo.getColour());

        System.out.println("------------------------------------------");
        System.out.println(tuzik);

        tuzik.lifeCycle();

        System.out.println("My weight is " + tuzik.getWeight());

        System.out.println("------------------------------------------");
        System.out.println(zzz);

        zzz.lifeCycle();

        System.out.println("I have poison, " + zzz.getPoison());

        System.out.println("------------------------------------------");

    }

}

