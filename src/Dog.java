import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal{

    private double weight;
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, Double weight) {
        super(name, birthDate, vaccinations, illness, owner);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


}


