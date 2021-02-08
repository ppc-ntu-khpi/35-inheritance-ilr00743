package domain;

 /**
 * The class Hamster extends Animal
 */ 
public class Hamster extends Animal{

    private String kind;
    
/** 
 *
 * A constructor with parameters
 *
 * @param name  the name of hamster
 * @param age  the age of hamster
 * @param weight  the weight of hamster
 * @param kind  the kind of hamster
 */
    public Hamster(String name, int age, float weight, String kind) { 

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kind = kind;
    }
    

/** 
 *
 * A constructor with parameters
 *
 * @param name  the name of hamster
 * @param age  the age of hamster
 * @param weight  the weight of hamster
 */
    public Hamster(String name, int age, float weight) { 

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.kind = "just a hamster";
    }
    

/** 
 *
 * A constructor with one parameter
 *
 * @param name  the name of hamster
 */
    public Hamster(String name) { 

        this(name, 1, 1.5f, "just a hamster");
    }


/** 
 *
 * A default constructor
 *
 */
    public Hamster() { 

        this("Hamster", 1, 1.5f, "just a hamster");
    }     


/** 
 *
 * Method that displays a string about that hamster is playing
 *
 */
    public void play() { 

        System.out.println("Hamster is running in the wheel");
    }


/** 
 *
 * Method that displays a string about that hamster is hiding in house
 *
 */
    public void hidingInHouse(){ 

        System.out.println("Hamster likes to hide in the corners of house");
    }
    
    @Override

/** 
 *
 * Method that displays a information about the hamster
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is hamster!";
    }
    
    @Override

/** 
 *
 * Method that displays a string about what hamster is speaking
 *
 */
    public void speak() { 

        System.out.println("Hamster says: *Silence*");
    }
   
    @Override

/** 
 *
 * Method that displays a string about what hamster is eating
 *
 */
    public void eat() { 

        System.out.println("Hamster eats seeds and fresh vegetables");
    }
}
