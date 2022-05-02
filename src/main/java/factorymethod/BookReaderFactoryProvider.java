package factorymethod;

import java.util.Map;

public class BookReaderFactoryProvider {

    private Map<String, BookReaderFactory> bookReaderFactories = Map.of(
            "csv", new CsvBookReaderFactory(),
            "xml", new XmlBookReaderFactory()
    );

    public BookReaderFactory getBookReaderFactory(String fileType) {
        if (bookReaderFactories.containsKey(fileType)) {
            return bookReaderFactories.get(fileType);
        } else {
            throw new IllegalArgumentException("Illegal format: " + fileType);
        }
    }
}
