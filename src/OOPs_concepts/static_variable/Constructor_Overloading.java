package OOPs_concepts.static_variable;

public class Constructor_Overloading {

    // Declare two instance variable or class variable
    int i,j;

    // constructor with no arguments
    Constructor_Overloading(){
        i = 10;
        j = 20;
    }

    // constructor with one argument
    Constructor_Overloading(int a) {
        i = a;
        j = 20;
    }

    // constructor with two arguments
    Constructor_Overloading(int a, int b) {
        i = a;
        j = b;
    }

    void display() {
        System.out.println("i = "+i);
        System.out.println("j = "+j);
    }


    public static void main(String[] args) {
        Constructor_Overloading a1 = new Constructor_Overloading(); // calls no argument constructor
        Constructor_Overloading a2 = new Constructor_Overloading(11); // calls constructor with one argument
        Constructor_Overloading a3 = new Constructor_Overloading(111, 222); // calls constructor with two arguments
        a1.display();
        a2.display();
        a3.display();
    }
}
