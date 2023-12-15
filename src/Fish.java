import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{

    private final String colour;
    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, String colour) {
        super(name, birthDate, vaccinations, illness, owner);
        this.colour = colour;
    }
    public String getColour (){
        return colour;
    }

}
