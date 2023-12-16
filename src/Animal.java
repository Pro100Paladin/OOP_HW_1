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

    private void wakeup (){
        System.out.println("Animal is wakeup !!");
    }

    private void wakeup (int time){
        System.out.println("Animal is wakeup in " + time);
    }

    private void eat (){
        System.out.println("Animal ate");
    }

    private void play (){
        System.out.println("Animal played");
    }

    private void sleep () {
        System.out.println("Animal sleeping");
    }

    private void sleep (int time) {
        System.out.println("Animal is sleep in  " + time);
    }

    private void toGo (){
        System.out.println("Animal moves");
    }

    private void fly (){
        System.out.println("Animal flies");
    }

    private void swim () {
        System.out.println("Animal swiming");
    }

    private void crawl (){
        System.out.println("Animal swiming");
    }

    public void lifeCycle () {
        wakeup();
        eat();
        toGo();
        play();
        sleep();
    }

    public void lifeCycleForFish () {
        wakeup();
        eat();
        swim();
        sleep();
    }

    public void lifeCycleForDuck () {
        wakeup();
        eat();
        swim();
        fly();
        toGo();
        play();
        sleep();
    }
    public void lifeCycleForDog () {
        wakeup();
        eat();
        play();
        sleep();
    }
    public void lifeCycleForSnake () {
        wakeup(2);
        eat();
        play();
        crawl();
        sleep(23);
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

