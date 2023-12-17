import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal{

    public String poison;
    public Snake(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, String poison) {
        super(name, birthDate, vaccinations, illness, owner);
        this.poison = poison;
    }
@Override
protected void lifeCycle(){
        wakeup();
        eat();
        crawl();
        eat();
        sleep();
}
    public String getPoison() {
        return poison;
    }

}
