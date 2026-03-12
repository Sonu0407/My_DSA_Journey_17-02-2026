package OOPs_concepts.static_variable;

public class Parameterized_Constructor {

    int empId;
    String empName;


    // parameterized constructor with two arguments
    Parameterized_Constructor(int id, String name) {
        this.empId = id;
        this.empName = name;
    }

    void display() {
        System.out.println("Id: " + empId + " Name: " + empName);
    }

    public static void main(String[] args) {
        Parameterized_Constructor obj1 = new Parameterized_Constructor(10001, "Gourav");
        Parameterized_Constructor obj2 = new Parameterized_Constructor(10002, "Amrutha");
        Parameterized_Constructor obj3 = new Parameterized_Constructor(10003, "Hitesh");
        obj1.display();
        obj2.display();
        obj3.display();
        // hence it is ver clear that each object will have its own copies of the instance variables
    }
}
