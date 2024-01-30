// More details about syntax:
// https://astexplorer.net/
// More details about references and data values:
// https://pythontutor.com/java.html

public class Cat{
        public boolean fictitious;

        public Cat(boolean fictitious){
                this.fictitious = fictitious;
        } // bye fictitious
        public String purr(){
                return "Woooooooof!";
        }

        public Object barf(){
                return null;
        }
        
        public static void main(String[] args){
          Object cat = new Cat(true);
          System.out.println(cat);
        } // bye cat =(
}
