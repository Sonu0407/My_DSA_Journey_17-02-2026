package OOPs_concepts.static_variable;

public class Method_Overloading {

    void test() {
        System.out.println("No parameters");
    }

    void test(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    void test(int a, float f) {
        System.out.println("a = " + a + " f = " + f);
    }

    double test(double d) {
        System.out.println("d = " + d);
        return d;
    }
}

class OverLoad {
    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        obj.test();
        obj.test(10, 20);
        obj.test(30, 3.14f);
        double obj2 = obj.test(3.14); // it is a variable obj2 because double as a return value
    }
}
