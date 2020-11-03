package Program;

import documentManage.documentManage;
import entities.Book;
import entities.Journal;
import entities.Newspaper;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        documentManage docManager = new documentManage();
        Menus menus = new Menus();
        do{
            System.out.println("1.Thêm tài liệu");
            System.out.println("2.Xem toàn bộ tài liệu");
            System.out.println("3.Sửa tài liệu");
            System.out.println("4.Xóa tài liệu");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1.Thêm sách");
                    System.out.println("2.Thêm tạp chí");
                    System.out.println("3.Thêm báo");
                    int typeOfDocument = Integer.parseInt(input.nextLine());
                    switch (typeOfDocument) {
                        case 1:
                            Book book = menus.addBook();
                            docManager.addDocument(book);
                            break;
                        case 2:
                            Journal journal = menus.addJournal();
                            docManager.addDocument(journal);
                            break;
                        case 3:
                            Newspaper newspaper = menus.addNewpaper();
                            docManager.addDocument(newspaper);
                            break;
                    }
                    docManager.displayAll();
                    break;
                case 2:
                    docManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập id tài liệu cần sửa");
                    docManager.update(Integer.parseInt(input.nextLine()));
                    break;
                case 4:
                    System.out.println("Nhập id tài liệu cần xóa");
                    docManager.delete(Integer.parseInt(input.nextLine()));
                    break;
            }
        }while (true);
    }
}
