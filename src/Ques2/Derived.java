package Ques2;

public class Derived extends Base {
    public Derived() {
        System.out.println("Calling Default Constructor of Derived Class");
    }
    public Derived(int x){
        super(11);
        System.out.println("Calling Parameterized constructor of derived Class with x equa to "+ x);

    }
}
