package lePackage;

import elPackage.B;
import thePackage.A;

public class C {
    final A anA = new A();
    final B aB = new B();
    final private int length; 
    private int[] argObjects; 
    private C(int argsLength){
        length = argsLength; 
    }

    public static void main(String[] args) {
        C c = new C(args.length);
        int[] argsObjs = new int[args.length];
        for(int argI=0; argI< c.length; argI++){
            String arg = args[argI];
            argsObjs[0] = Integer.parseInt(arg); 
        }

    }
}
