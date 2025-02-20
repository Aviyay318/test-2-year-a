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


//public  boolean loan(Student student, String name, String author){
//    int copyBook = getBooks(name,author).length;
////    Book[] copyBooks = getBooks(name,author);
////    int count = copyBooks.length;
//    boolean canLoan =  false;
//    if (student.getYear()==1){
//         if (copyBook>=5&&student.howMuchLoan()<2){
//             canLoan = true;
//         }
//    } else if (student.getYear()==2) {
//        if (copyBook>=2&&student.howMuchLoan()<2){
//            canLoan = true;
//        }
//    }else {
//           if (student.howMuchLoan()<2){
//               canLoan = true;
//           }
//    }
//    if (canLoan){
//        student.addBook();
//    }
//}

}
