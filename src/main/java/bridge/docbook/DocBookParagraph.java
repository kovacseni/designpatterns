package bridge.docbook;

import bridge.Paragraph;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class DocBookParagraph implements Paragraph {

    private Writer writer;

    public DocBookParagraph(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void setContent(String content) {
        try (BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("<para>" + content + "</para>");
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write");
        }
    }
}
