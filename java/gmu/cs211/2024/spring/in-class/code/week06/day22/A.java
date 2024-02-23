package week06.day22;
// import ../day23/C.java
import week06.day23.C;

public class A{
	public  static void main(String[] args){
		Object b = new B();
		Able bi = (Able)b;
		// Able b = new B(); // same thing as above but implicit, casting was there from day 0. You cast the object reference as any of the super classes or interfaces in its hierarchies. The Java docs makes really simple to see them. Remember Object types everywhere in P1.
		bi.doIt(); // same goes with dynamic dispatch, here the doIt() being dispatch is the one in B not in Able. Overrides always uses the lowest overriden method given a concrete class. Remember toString() in P1.
		C c = new C();
		System.out.println("Hello");
	}
}
