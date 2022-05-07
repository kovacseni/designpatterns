package composite;

import java.io.IOException;
import java.io.Writer;

public class DocumentWriter {

    public void write(DocumentPart documentPart, Writer writer) {
        try {
            writer.write(documentPart.getPrefix());
            writer.write(documentPart.getContent());
            for (DocumentPart d : documentPart.getChildren()) {
                write(d, writer);
            }
            writer.write(documentPart.getPostfix());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write", ioe);
        }
    }
}
