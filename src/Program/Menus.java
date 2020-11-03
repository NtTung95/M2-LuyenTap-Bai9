package Program;

import entities.Book;
import entities.Document;
import entities.Journal;
import entities.Newspaper;

import java.time.LocalDate;
import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public void updateDoc(Document documents) {
        System.out.println("Nhập ID tài liệu");
        documents.setId(Integer.parseInt(input.nextLine()));
        System.out.println("Nhập tên nhà xuất bản");
        documents.setPublisher(input.nextLine());
        System.out.println("Nhập số lượng");
        documents.setQuantities(Integer.parseInt(input.nextLine()));
    }

    public Book addBook(){
        Book book = new Book();
        updateDoc(book);
        System.out.println("Nhập tên tác giả");
        book.setNameAuthor(input.nextLine());
        System.out.println("Nhập số trang");
        book.setPages(Integer.parseInt(input.nextLine()));
        return book;
    }

    public Journal addJournal(){
        Journal journal = new Journal();
        updateDoc(journal);
        System.out.println("Nhập mã số tạp chí");
        journal.setIdJournal(Integer.parseInt(input.nextLine()));
        System.out.println("Nhập ngày xuất bản tạp chí");
        journal.setReleaseMonth(LocalDate.of(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
        return journal;
    }

    public Newspaper addNewpaper(){
        Newspaper newspaper = new Newspaper();
        updateDoc(newspaper);
        System.out.println("Nhập ngày xuất bản báo");
        newspaper.setReleaseDate(LocalDate.of(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
        return newspaper;
    }
}
