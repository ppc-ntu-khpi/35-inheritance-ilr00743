package domain;

/**
 *
 * @author Illia_R
 */
public class Animal {

    protected String name;
    
    protected int age;
    protected float weight;

    public Animal() {
        name = "Name";
        age = 0;
        weight = 1;
    }

    public void eat() {
        System.out.println("Animal eating");
    }

    public void speak() {
        System.out.println("Animal speaking");
    }
    
    public void sleep() {
        System.out.println("Animal sleeping");
    }

    @Override
    public String toString() {
        return "My animal: " + "\nName: \t" + name + "\nAge: \t" + age + "\nWeight: \t" + weight+" kg";
    }
    
}
