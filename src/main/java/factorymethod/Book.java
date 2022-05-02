package factorymethod;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

    private String authors;

    private String title;

    public Book() {
    }

    public Book(String authors, String title) {
        this.authors = authors;
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
