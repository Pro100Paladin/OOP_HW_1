import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal{

    private double weight;
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, Double weight) {
        super(name, birthDate, vaccinations, illness, owner);
        this.weight = weight;
    }
@Override
protected void lifeCycle(){
    wakeup();
    eat();play();
    sleep(17);
}
    public double getWeight() {
        return weight;
    }


}


