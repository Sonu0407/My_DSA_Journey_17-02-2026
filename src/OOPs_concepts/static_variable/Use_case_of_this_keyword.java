package OOPs_concepts.static_variable;

import java.nio.file.attribute.UserPrincipal;

//public class Use_case_of_this_keyword {
//    int i, j;
//
//    // declare a constructor
//    Use_case_of_this_keyword() {
//        this(100); // which calls the constructor which takes one integer argument
//    }
//
//    Use_case_of_this_keyword(int a) {
//        this(a, 200); // which calls the constructor which takes two integer arguments
//    }
//
//    Use_case_of_this_keyword(int a, int b) {
//        i = a;
//        j = b;
//    }
//
//    public static void main(String[] args) {
//        Use_case_of_this_keyword obj1 = new Use_case_of_this_keyword();
//        System.out.println("i = "+obj1.i + " " + "j = "+obj1.j);
//    }
// }


// this keyword is use resolve the name conflicts for example
//public class Use_case_of_this_keyword {
//    int i, j;
//
////    Use_case_of_this_keyword(int i, int j) {
////        i = i;  // It is confusing, which 'i' is assigning to which 'i'
////        j = j; // It is confusing, which 'j' is assigning to which 'j'
////    }
//    // so to avoid this kind of problem this keyword is use full
//
//    Use_case_of_this_keyword(int i, int j) {
//        this.i = i;
//        this.j = j;
//        // here this.i refers to instance variable and i is refers to method argument
//    }
//}


// this keyword is also used inside non-static method for example
public class Use_case_of_this_keyword {
    int i, j;

    void function() {
        int i = 100;
        System.out.println(i);             // prints the value of local variable 'i'
        System.out.println(this.i);        // prints the value of instance variable 'i'
    }

    public static void main(String[] args) {
        Use_case_of_this_keyword obj = new Use_case_of_this_keyword();
        obj.function();
    }
}
