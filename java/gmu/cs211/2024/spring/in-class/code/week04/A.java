import java.util.Optional; // an inmport

/**
 * A
 */
public class A {
    boolean x = false; // an instance variable
    static int  y = 0; // a class variable, it keeps count how many instances have been created.
    final int myY; // and instance variable, but is cannot be modified once is set
    // static boolean x = true; // name collisions
    A() {
        this.x =true;  // direct instance referece (this)
        A.y++; // class reference, changes the class variable
        myY= A.y; // keeping track of the local value
    }

    public static void main(String[] args) {
        A a = new A(); // one instace
        a = new A(); // another instance, replaces the old one...
        A a1 = new A(); // so now a third instance
        // a1.y++; // wut? static mod? from the instance reference
        // a1.myY++; // nope. final mod does not let you change the variable value after is set.
        a1 = new A(); // another instance, how many so far?

        // What this class will let you do =)
        Optional<String> hello =Optional.of("Hello"); // preventing null references with specialized classes, genertics
        hello.ifPresent(System.out::println); // and design patterns and method refrences... wut?
    }
}
