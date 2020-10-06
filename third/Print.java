package third;

public class Print implements Printable{
    private final String author;
    private final String name;
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public Print(String name,String author){
        this.author =author;
        this.name = name;
    }
    @Override
    public void print() {
        System.out.printf("%s (%s)\n",name,author);
    }
}
