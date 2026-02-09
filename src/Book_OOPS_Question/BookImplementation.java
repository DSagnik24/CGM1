package Book_OOPS_Question;

import java.util.*;

public class BookImplementation {

    public String getNameOfBooks(List<Book>books){
        StringBuilder sb = new StringBuilder();
        for(Book b:books){
            sb.append(b.getBookName())
                    .append(" ")
                    .append(b.getBookCost())
                    .append(" ");
        }
        return sb.toString().trim();
    }
    public int sumCostOfAllBooks(List<Book>books){
        int sum = 0;
        for(Book b: books){
            sum += b.getBookCost();
        }
        return sum;
    }
    public int getMax(List<Book>books){
        int max = Integer.MIN_VALUE;

        for(Book b:books){
            if(b.getBookCost()>max){
                max = b.getBookCost();
            }
        }
        return max;
    }
}
