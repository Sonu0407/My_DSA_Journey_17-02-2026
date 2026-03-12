package OOPs_concepts.static_variable;

import com.sun.tools.javac.Main;

import java.util.Objects;

public class why_static_in_main {
    public static void main(String[] args) {
        // why public static void main is a static one?
        // what is static first?
        // static means you can use the main function method without creating an object
        // of that class
        // if main is not you be not able the run the program
        // main is the first that you have to run
        // then if you don't put main as static obviously in order to run it you have
        // to create an object for it
        // user should be able to run the program without creating object that's main the declared a static

        func();

//        swap(); // it is give me an error because
        // inside the static method you can not use anything that is not static
    }


    static void func() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances


        // you cannot access non static stuff without referencing their instances in
        // a static context


        // hence, here i am referencing it
//        Main obj = new Main();
//        obj.swap();
    }




    // we know that something which is not static, belongs to an object
    void swap() {
        System.out.println("greeting");
    }

}
