package OOPs_concepts.static_variable;

public class creating_class {
    public static void main(String[] args) {
        text obj = new text(); // this is called instantiation because the process of creating
        // an object of a class is called instantiation
        func newObj = new func();
        Bicycle by1 = new Bicycle();
        System.out.println(by1.gear);
        by1.breaking();
//        System.out.println(by1.breaking()); // this doesn't work because already i am
        // printing in the breaking

    }


    public static class Bicycle {
        private int gear = 5;
        static int age = 30; // this is static variable or class variable
        int regno = 7;// this instance variable

        public void breaking() {
            System.out.println("Working of Breaking");
        }
    }

    // examples for creating classes
    static public class text {

        public static int max(int num1, int num2) {
            int result = 0;
            if (num1 > num2) {
                result = num1;
            } else {
                result = num2;
            }
            return result;
        }

    }

    public class demo {

    }
}

class func {

}




