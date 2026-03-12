package OOPs_concepts.Static_classes;

public class demoStaticBlock {

    static int i = 100;

    static class StaticInnerClass {

        public void display() {
            System.out.println("The value of i is : " +i);
        }

        public static void print() {
            System.out.println("The value of i is : " +i);
        }
    }
}

class StaticClassDemo {

    public static void main(String[] args) {
        demoStaticBlock.StaticInnerClass obj = new demoStaticBlock.StaticInnerClass();
        obj.display();
        demoStaticBlock.StaticInnerClass.print(); // can access static methods directly
    }
}
