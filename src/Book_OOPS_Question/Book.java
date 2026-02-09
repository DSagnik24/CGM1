package Book_OOPS_Question;

public class Book {
    private String bookName;
    private int bookCost;

    public Book(String bookName, int bookCost){
        this.bookName = bookName;
        this.bookCost = bookCost;
    }
    public String getBookName(){
        return bookName;
    }
    public int getBookCost(){
        return bookCost;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setBookCost(int bookCost){
        this.bookCost = bookCost;
    }
}
