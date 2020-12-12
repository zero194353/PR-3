class Book{
    String author;
    String name;
    int year;
    int numberOfPages;
    int numberOfChapters;

    String getAuthor(){
        return author;
    }
    String getName(){
        return name;
    }

    int getYear(){
        return year;
    }
    int getNumberOfPages(){
        return numberOfPages;
    }


    void setAuthor(String author){
        this.author = author;
    }
    void setName(String name){
        this.name = name;
    }
    void setYear(int year){
        this.year = year;
    }
    void setNumberOfPages(int n){
        numberOfPages = n;
    }



}


public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Harper Lee");
        book.setName("To Kill a Mockingbird");
        book.setYear(1960);
        book.setNumberOfPages(324);


        System.out.println("Author: " + book.getAuthor() + "\nName of book: " + book.getName() + "\nYear: " + book.getYear() + "\nPages: " + book.getNumberOfPages());
    }
}
