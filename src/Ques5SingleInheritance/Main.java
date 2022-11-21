package Ques5SingleInheritance;

public class Main {
    public static void main(String[] args) {
        parent obj = new parent();
        obj.showParent();
        child ob = new child();
        ob.showParent();
        ob.showChild();
    }
}
