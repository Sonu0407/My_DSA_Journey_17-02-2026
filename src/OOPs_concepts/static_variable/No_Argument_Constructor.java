package OOPs_concepts.static_variable;

public class No_Argument_Constructor {
    int age;
    float percentage;

    No_Argument_Constructor() {
        age = 21;
        percentage = 99.97f;
    }

    public static void main(String[] args) {
        No_Argument_Constructor obj = new No_Argument_Constructor();
        System.out.println("Age = "+obj.age);
        System.out.println(("Percentage = "+obj.percentage));
    }
}
