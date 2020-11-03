package documentManage;

import Program.Menus;
import entities.Book;
import entities.Document;
import entities.Journal;
import entities.Newspaper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class documentManage {
    Scanner input = new Scanner(System.in);
    Menus menus = new Menus();
    ArrayList<Document> documentList = new ArrayList<>();

    public void addDocument(Document document){
        documentList.add(document);
    }

    public void displayAll(){
        if(documentList.isEmpty()){
            System.out.println("Không có dữ liệu");
        }
        for (Document documents : documentList) {
            System.out.println(documents);
        }
    }

    public void delete(int id){
        Document deleteDocument = new Document();
        for (Document documents : documentList) {
            if(documents.getId() == id){
                deleteDocument = documents;
            }
        }
        documentList.remove(deleteDocument);
        displayAll();
    }

    public void update(int id){
        for (Document documents : documentList) {
            if(documents.getId() == id){
                if(documents instanceof Book){
                    updateDoc(documents);
                    System.out.println("Nhập tên tác giả");
                    ((Book) documents).setNameAuthor(input.nextLine());
                    System.out.println("Nhập số trang");
                    ((Book) documents).setPages(Integer.parseInt(input.nextLine()));

                }
                if(documents instanceof Journal){
                    updateDoc(documents);
                    System.out.println("Nhập id tạp chí");
                    ((Journal) documents).setIdJournal(Integer.parseInt(input.nextLine()));
                    System.out.println("Nhập ngày xuất bản tạp chí");
                    ((Journal) documents).setReleaseMonth(LocalDate.of(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
                }
                if(documents instanceof Newspaper){
                    updateDoc(documents);
                    System.out.println("Nhập ngày xuất bản báo");
                    ((Newspaper) documents).setReleaseDate(LocalDate.of(Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())));
                }
            }
        }
    }

    public void updateDoc(Document documents) {
        System.out.println("Nhập tên nhà xuất bản");
        documents.setPublisher(input.nextLine());
        System.out.println("Nhập số lượng");
        documents.setQuantities(Integer.parseInt(input.nextLine()));
    }
}
