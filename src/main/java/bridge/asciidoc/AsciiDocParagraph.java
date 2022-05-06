package bridge.asciidoc;

import bridge.Paragraph;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class AsciiDocParagraph implements Paragraph {

    private Writer writer;

    public AsciiDocParagraph(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void setContent(String content) {
        try (BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(" " + content + "\n\n");
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write");
        }
    }
}
