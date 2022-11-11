package Ques4;

public class RWOnly {
    private String name;

    public RWOnly(String name) {
        this.name = name;
//        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
