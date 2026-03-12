package OOPs_concepts.static_variable;

public class Demo1 {

    int x = 0;

    void functionD() {
        x = 10;
        Demo1 d = new Demo1();
        d.x = 115;
        System.out.println("Inside functionD() d.x = " + d.x);
        System.out.println("Inside functionD() x = " + x);
        System.out.println("End of functionD()");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.functionD();
        System.out.println("Inside main() d.x = " + d.x);
    }
}
