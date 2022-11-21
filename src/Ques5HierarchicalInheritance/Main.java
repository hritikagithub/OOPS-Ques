package Ques5HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
//        c.bark(); gives an error because bark is define in dog class not in cat class
        Dog d = new Dog();
        d.bark();
        d.eat();
//        d.meow();gives an error because meow is define in cat class not in dog class
    }
}
