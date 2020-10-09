package Practice3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String author;
        String name;
        int year;

        System.out.println("Введите автора: ");
        author = in.next();
        System.out.println("Введите название: ");
        name = in.next();
        System.out.println("Введите год: ");
        year = in.nextInt();

        Book book1 = new Book(author, name, year);
        book1.Info();

    }
}

class Book{
    private String author;
    private String name;
    private int year;

    Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }
    void Info(){
        System.out.println(author +", " + name + ", " + year);
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

}