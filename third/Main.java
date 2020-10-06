package third;

public class Main {
    public static void main(String[] args) {
         Print book = new Print("Book","Author");
         book.print();
         Printable.read();
         //book.read() нельзя
    }
}
interface Printable{
     void print();
     static void read(){
         System.out.println("I want to sleep.");
     }
}

