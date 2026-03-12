package OOPs_concepts.static_variable;

public class Static_variable {
    // we can access static_variable using class name don't need to create an object for it
    int x, y;
    static int z = 10;

    public static void main(String[] args) {
        Static_variable obj1 = new Static_variable();
        Static_variable obj2 = new Static_variable();
        System.out.println(obj1.x);
        System.out.println(obj2.y);
        // here it comes
        System.out.println(Static_variable.z);
    }
}
