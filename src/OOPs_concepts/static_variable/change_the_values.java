package OOPs_concepts.static_variable;

public class change_the_values {

    // instance variable
    int i;
    int j = 2;

    public static void main(String[] args) {

        change_the_values obj1 = new change_the_values();

        System.out.println("Object 1: The value of i = " + obj1.i);
        System.out.println("Object 1: The value of j = " + obj1.j);

        obj1.i = 10;
        obj1.j = 20;

        System.out.println("After Changing : Object 1: The value of i = " + obj1.i);
        System.out.println("After Changing : Object 1: The value of j = " + obj1.j);

        change_the_values obj2 = new change_the_values();

        System.out.println("Object 2: The value of i = " + obj2.i);
        System.out.println("Object 2: The value of j = " + obj2.j);

        obj2.i = 1111;
        obj2.j = 2222;

        System.out.println("After Changing : Object 2: The value of i = " + obj2.i);
        System.out.println("After Changing : Object 2: The value of j = " + obj2.j);
    }
}