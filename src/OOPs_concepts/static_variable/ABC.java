package OOPs_concepts.static_variable;

public class ABC {
    int i = 10, j = 20;

    void function1() {
        i = i + 1;
        j = j + 1;
        function2();
        System.out.println("Inside function1()");
    }

    void function2() {
        System.out.println(i);
        System.out.println(j);
        System.out.println("Inside function2()");
    }

    public static void main(String[] args) {

        // creating an instantiation means an object
        ABC a1 = new ABC();
        a1.function1();
        System.out.println("End of main");
    }
}
