package entities;

public class Book extends Document {
    private String nameAuthor;
    private int pages;

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", publisher=" + getPublisher() +
                ", quantities=" + getQuantities() +
                ", nameAuthor=" + nameAuthor +
                ", pages=" + pages +
                '}';
    }
}
