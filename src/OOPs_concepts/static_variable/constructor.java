package OOPs_concepts.static_variable;

public class constructor {

    int age;

    constructor() { // this is called constructor
        System.out.println("Constructor Called");
        age = 21;
    }

    public static void main(String[] args) {
        // constructor is invoked while creating the object of the constructor class
        constructor obj = new constructor();
        System.out.println("The age is : " + obj.age);
    }
}


