import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    protected void wakeup (){
        System.out.println("Animal is wakeup !!");
    }
    protected void wakeup (int time){
        System.out.println("Animal is wakeup in " + time);
    }
    protected void eat (){
        System.out.println("Animal ate");
    }
    protected void play (){
        System.out.println("Animal played");
    }
    protected void sleep () {
        System.out.println("Animal sleeping");
    }
    protected void sleep (int time) {
        System.out.println("Animal is sleep in  " + time);
    }
    protected void toGo (){
        System.out.println("Animal moves");
    }
    protected void fly (){
        System.out.println("Animal flies");
    }
    protected void swim () {
        System.out.println("Animal swimming");
    }
    protected void crawl (){
        System.out.println("Animal crawling");
    }

    protected void lifeCycle () {

    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}

