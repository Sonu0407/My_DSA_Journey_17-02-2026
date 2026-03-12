package OOPs_concepts.Static_Block;

public class demoStaticBlock {

    // static variables
    static int a = 18;
    static int b;
    static int max;

    // static block
    static {
        System.out.println("First Static Block");
        b = a + 3;
    }

    static {
        System.out.println("Second Static Block");
        max = 99;
    }

    // Non-static block
    {
        System.out.println("Non Static Block");
    }


    // static method
    static void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("max = " + max);
    }

    public static void main(String[] args) {
        // calling the static method
        display();
        // non-static block will never be executed if the object of that class is not created
//        demoStaticBlock obj = new demoStaticBlock(); // Non-Static Block executes
    }
}
