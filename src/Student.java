public class Student {
    private  String name;
    private Book[] books;
    private int year;

     public int howMuchLoan(){
         return this.books.length;
     }

    public void addBook(Book book){
       Book[] tempBook = new Book[this.books.length+1] ;
        for (int i = 0; i < this.books.length; i++) {
            tempBook[i]  = this.books[i];
        }
        tempBook[tempBook.length-1] = book;
        this.books = tempBook;
    }

    public int getYear(){
        return this.year;
    }
}
