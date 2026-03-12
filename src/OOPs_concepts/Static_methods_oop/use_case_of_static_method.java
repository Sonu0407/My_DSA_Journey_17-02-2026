package OOPs_concepts.Static_methods_oop;

public class use_case_of_static_method {
    int x, y;
    static int z = 20; // static variable or class variable

    static void method1() { // static static only can access static variable or static methods
        System.out.println(z);
    }

    public static void main(String[] args) {
        use_case_of_static_method.method1();
    }
}

// static cannot access non-static data example
class staticDemo {
    int x, y;
    static int z;

    static void method1() {
//        System.out.println(x);
        // this gives error because you can access non-static in static
//        System.out.println(y);
        // even this also
        System.out.println(z);
        // can access because both are static and static
    }
}

// another example
class staticDemo2 {
    static void method1() {
        method2(); // allowed
        //method3(); // not allowed because non-static with static
    }
    static void method2(){

    }
    void method3(){

    }
}

// best example of static keyword

class staticDemo3 {
    int i;
    static int j;

    public static void main(String[] args) {
        System.out.println(j); // j is static and available to main() simple static == static
        //System.out.println(i); // i is non-static and not available to main()

        j = 25;         // j is declared in the same class, we can use directly
        System.out.println(j);

        staticDemo3 obj = new staticDemo3();
        obj.i = 10;
        System.out.println(obj.i);


    }
}

class staticDemo4 {
    int i;
    static int j;

    static void function1() {
        System.out.println("Value of j in function1() Before Increment = " +j);
        j = j + 1;
        System.out.println("Value of j in function() After Increment = " +j);
        staticDemo4 s1 = new staticDemo4(); // to access the instance variable we need to create a object of it
        s1.i = 15;
        System.out.println("Value of s1.i in function1() = " +s1.i);
    }

    public static void main(String[] args) {
        function1();
        function1();
        staticDemo4 s2 = new staticDemo4();
        s2.i = 150;
        System.out.println("Value of s2.i in main() = " +s2.i);

    }

}