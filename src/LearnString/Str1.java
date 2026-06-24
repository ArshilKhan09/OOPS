package LearnString;

public class Str1 {
    public static void main(String[] args) {

        // Both point one object ->"Arshil" in String pool
        String name = "Arshil";
        String same = "Arshil";

        // It is created somewhere else in Heap Memory whether the name "Arshil" is same
        String newName = new String("Arshil");

    }
}
