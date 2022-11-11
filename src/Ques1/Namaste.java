package Ques1;

public class Namaste {

        public Namaste() {

            System.out.println("The Default constructor says Namaste");
            Namaste obj = new Namaste("xyz");
        }
        public Namaste (String x){
            this("xyz" ,"abc");
            System.out.println("Namaste from " + x);

        }
        public Namaste(String x,String y){

            System.out.println("Namaste from " + x + " to " + y);
        }



}
