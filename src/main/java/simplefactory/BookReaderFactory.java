package simplefactory;

public class BookReaderFactory {

    public BookReader reader(String type) {
        if (type.equals("csv")) {
            return new CsvBookReader();
        } else if (type.equals("xml")) {
            return new XmlBookReader();
        } else {
            throw new IllegalArgumentException("Invalid file type");
        }
    }
}
