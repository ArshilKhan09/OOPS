package CLASSES_OBJECTS;

public class LEC1 {
    public static void main(String[] args) { //public class sirf 1 hi rahegi 1 file main

        // Created Car Object for accessing Car property and behaviour
        Car c1 = new Car();
        c1.company = "Audi";
        c1.model = "v8";
        c1.price = 1500000;

        c1.start();
        c1.running();
        c1.stop();
        System.out.println();
        Car c2 = new Car();
        c2.company = "Mercedes";
        c2.model = "G-Wagon";
        c2.price = 10000000;

        c2.start();
        c2.running();
        c2.stop();
    }
}


// A class has property and behaviour , both are closely grouped inside a class
// properties == variable defined kiye hai
// behaviour == function defined kiye hai


class Car {         // It is just a Blueprint of Car actual Car was made inside a MAIN class File (which has main function inside it)

    String company = "BMW" ;           //property of class Car
    String model = "M5 Competition";   //property of class Car
    int price = 20000000 ;             //property of class Car


    // function
    void start(){                   // behaviour of class Car
        System.out.println(company+" "+model+" has started");
    }

    void running(){                 // behaviour of class Car
        System.out.println(company+" "+model+" is running");
    }

    void stop(){                    // behaviour of class Car
        System.out.println(company+" "+model+" has stopped");
    }
}
