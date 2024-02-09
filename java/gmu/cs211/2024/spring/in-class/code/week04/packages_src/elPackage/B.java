package elPackage;
public class B {
    int x =0;
    static int id = 0;
    final int myId;
    public B(){
        this.myId = B.id;
        // B.id++;
        B.id= B.id+1;
    }
    public int getX() {
        return this.x;
    }

    @Override
    public String toString() {
        return "B: x:" +x;
    }

    public static void main(String[] args) {
        final B b = new B();
        b.x++;
        // b = new B();
        final B b1 = new B();
        b1.x++;
        System.out.println(b);
    }
}
