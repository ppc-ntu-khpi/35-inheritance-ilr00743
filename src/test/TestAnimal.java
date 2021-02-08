package test;

import domain.Hamster;

 /**
 * The class Test Animal
 */ 
public class TestAnimal {
    
/** 
 *
 * The method Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Hamster hamster = new Hamster("Bro", 2, 1.4f);
        System.out.println(hamster);
        hamster.eat();
        hamster.speak();
        hamster.play();
        hamster.hidingInHouse();
        hamster.sleep();
    }
}
