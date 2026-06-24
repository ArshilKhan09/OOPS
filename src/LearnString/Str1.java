package LearnString;

public class Str1 {
    public static void main(String[] args) {

        // Both point one object ->"Arshil" in String pool
        String name = "Arshil";
        String sameName = "Arshil";

        // It is created somewhere else in Heap Memory whether the name "Arshil" is same
        String newName = new String("Arshil");


        if(name == sameName){       // OP-> Same
            System.out.println("Both are Same");
        }
        if(name == newName){        // OP-> Not Same
            System.out.println("Both are Same");
        }
        else{
            System.out.println("Both are not Same");
        }
    }
}
