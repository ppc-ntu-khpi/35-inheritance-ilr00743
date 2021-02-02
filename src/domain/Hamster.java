package domain;

/**
 *
 * @author Illia_R
 */
public class Hamster extends Animal{
    private String kind;

    public Hamster(String name, int age, float weight, String kind) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kind = kind;
    }
    
    public Hamster(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kind = "just a hamster";
    }
    
    public Hamster(String name) {
        this(name, 1, 1.5f, "just a hamster");
    }
    
    public Hamster() {
        this("Hamster", 1, 1.5f, "just a hamster");
    }     

    public void play() {
        System.out.println("Hamster is running in the wheel");
    }
    
    public void hidingInHouse(){
        System.out.println("Hamster likes to hide in the corners of house");
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is hamster!";
    }

    @Override
    public void speak() {
        System.out.println("Hamster says: *Silence*");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eats seeds and fresh vegetables");
    }
}
