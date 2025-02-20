public class Book {
private String name;
private String author;


public  boolean isEquals(String name, String author){
    if (this.name.equals(name)&&this.author.equals(author)){
        return true;
    }
    return false;
}

}
