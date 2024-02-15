public class Dog extends Animal {
  Dog(int x){
  // super(null);
  super(9);
  }
  // Cat(String name){
  // super(name);
  // }
  
  void meow(){}
  
  public static void main(String[] args) {
    Animal a =new Dog(1);
    a.exist();
    // a.meow(); // sub
    Dog b =new Dog(2);
    b.exist();// super
    b.meow(); // sub
  }
}

class Animal{
  String name;
  
  Animal(String name){
    this.name = name;
  }
  
  Animal(int name){
    this.name =""+ name;
  }
  
  void exist(){}

}
