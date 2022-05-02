package abstractfactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class CsvBookWriter implements BookWriter {

    @Override
    public void writeBook(Book book, Writer writer) {
        try (BufferedWriter bw = new BufferedWriter(writer)){
            bw.write(book.getAuthors() + ";" + book.getTitle());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }
}
