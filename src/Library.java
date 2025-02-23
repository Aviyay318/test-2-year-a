public class Library {
    private Book[] books;
    private Student[] students;



public Book[] getBooks(String name, String author){
    int count = 0;
    for (int i = 0; i < this.books.length; i++) {
        if (this.books[i].isEquals(name,author)){
            count++;
        }
    }
    Book[] newBooks = new Book[count];
    int j =0;
    for (int i = 0; i < this.books.length; i++) {
        if (this.books[i].isEquals(name,author)){
         newBooks[j] = this.books[i];
         j++;
        }
    }
    return newBooks;
}


public  boolean loan(Student student, String name, String author){
       Book[] copyBooks = getBooks(name,author);
    int copyBook = copyBooks.length;
//    Book[] copyBooks = getBooks(name,author);
//    int count = copyBooks.length;
    boolean canLoan =  false;
    if (student.getYear()==1){
         if (copyBook>=5&&student.howMuchLoan()<2){
             canLoan = true;
         }
    } else if (student.getYear()==2) {
        if (copyBook>=2&&student.howMuchLoan()<2){
            canLoan = true;
        }
    }else {
           if (copyBook>=1&&student.howMuchLoan()<2){
               canLoan = true;
           }
    }
    if (canLoan){
        student.addBook(copyBooks[0]);
        removeBook(name,author);
    }
    return canLoan;
}


public void removeBook(String name, String author){
    Book[] tempBooks = new Book[this.books.length-1];
    boolean isRemove = false;
    int index = 0;
    for (int i = 0; i < this.books.length; i++) {
         if (!this.books[i].isEquals(name,author)||isRemove){
             tempBooks[index] = this.books[i];
               index++;
         }else {
             isRemove = true;
         }
    }
    this.books = tempBooks;
}
}
