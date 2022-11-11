package Ques2;

public class Base {
    public Base() {
        this(10);
        System.out.println("Calling Default Constructor of Base Class");

    }
    public Base(int x){
        System.out.println("Caling Parameterized constructor of Base Class with x equal to "+ x);
    }


}
