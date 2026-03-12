package OOPs_concepts.static_variable;

public class practice_classes {
    public static void main(String[] args) {
        A a1 = new A();
        a1.i = 10;
        a1.j = 20;

        A a2 = new A();
        a2.i = 11;
        a2.j = 22;
    }

}

class A {
    // declare two instance variable
    int i;
    int j;


}
