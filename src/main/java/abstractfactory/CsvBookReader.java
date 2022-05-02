package abstractfactory;

import java.io.Reader;
import java.util.Scanner;

public class CsvBookReader implements BookReader {

    @Override
    public Book readBook(Reader reader) {
        try (Scanner scanner = new Scanner(reader)) {
            String line = scanner.nextLine();
            String[] temp = line.split(";");
            return new Book(temp[0], temp[1]);
        }
    }
}
