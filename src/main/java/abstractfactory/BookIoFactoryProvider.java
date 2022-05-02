package abstractfactory;

import java.util.Map;

public class BookIoFactoryProvider {

    private Map<String, BookIoFactory> bookIoFactories = Map.of(
            "csv", new CsvBookIoFactory(),
            "xml", new XmlBookIoFactory()
    );

    public BookIoFactory getBookIoFactory(String fileType) {
        if (bookIoFactories.containsKey(fileType)) {
            return bookIoFactories.get(fileType);
        } else {
            throw new IllegalArgumentException("Illegal file type: " + fileType);
        }
    }
}
