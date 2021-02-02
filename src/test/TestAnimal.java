package test;

import domain.Hamster;
/**
 *
 * @author Illia_R
 */
public class TestAnimal {
    
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
