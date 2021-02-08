package domain;

 /**
 * The class Animal
 */ 
public class Animal {
    protected String name;
    protected int age;
    protected float weight;    

/** 
 *
 * A default constructor. 
 *
 */
    public Animal() { 
        name = "Name";
        age = 0;
        weight = 1;
    }
    
/** 
 *
 * Method that displays a string about what the animal is eating
 *
 */
    public void eat() { 

        System.out.println("Animal eating");
    }
    
/** 
 *
 * Method that displays a string about what the animal is speaking
 *
 */
    public void speak() { 

        System.out.println("Animal speaking");
    }
    
/** 
 *
 * Method that displays a string about the sleep of the animal
 *
 */
    public void sleep() { 

        System.out.println("Animal sleeping");
    }
    
    @Override
/** 
 *
 * Method that display information about the animal
 *
 * @return String
 */
    public String toString() { 

        return "My animal: " + "\nName: \t" + name + "\nAge: \t" + age + "\nWeight: \t" + weight+" kg";
    }
    
}
