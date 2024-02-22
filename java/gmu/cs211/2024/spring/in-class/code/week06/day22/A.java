package week06.day22;
// import ../day23/C.java
import week06.day23.C;

public class A{
	public  static void main(String[] args){
		Object b = new B();
		Able bi = (Able)b;
		bi.doIt();
		C c = new C();
		System.out.println("Hello");
	}
}
