package thePackage;
import java.util.Optional;

/**
 * A
 */
public class A {
    boolean x = false;
    static int  y = 0;
    final int myY;
    // static boolean x = true;
    public A() {
        this.x =true; 
        A.y++;
        myY= A.y;
    }

    public static void main(String[] args) {
        A a = new A();
        a = new A();
        A a1 = new A();
        // a1.y++; // wut? static mod
        // a1.myY++; // nope. final mod
        a1 = new A();
        // System.out.println("y", );
        Optional<String> hello =
        Optional.of("Hello");
        hello.ifPresent(System.out::println);
    }
}