package OOPs_concepts;

import javax.xml.namespace.QName;

public class create_class {
    public static void main(String[] args) {

        Student kunal = new Student(100, "Rahul", 82.00f);
//        Student student2 = new Student();

        // default initializing
//        student2.rno = 07;
//        student2.name = "Sonu";
//        student2.marks = 90.0f;
//
//        kunal.rno = 21;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 100.0f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        final Student sonu = new Student(12, "rahul", 56.00f);
        sonu.name = "other name"; // can change when it non-primitive value

        // when a non-primitive is final, you cannot reassign it.
//        sonu = new Student(23, "jdawjwd", 90.0f); // error

//        System.out.println(student2.rno);
//        System.out.println(student2.name);
//        System.out.println(student2.marks);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object
    // and the word is "this" keyword

    // creating a constructor
    // when you call object with empty constructor then this is called
    Student () {
        this.rno = 13;
        this.name = "Sonu";
        this.marks = 88.5f;
    }

    // passing argument during the object creation
    // when you pass arguments when creating objects you call this function
    Student (int rno, String name, float marks) { // variables are same then should use this keyword
        // or should different variable name
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}


