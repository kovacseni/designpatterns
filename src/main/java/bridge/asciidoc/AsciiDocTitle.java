package bridge.asciidoc;

import bridge.Title;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class AsciiDocTitle implements Title {

    private Writer writer;

    public AsciiDocTitle(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void setContent(String content) {
        try (BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("= " + content + "\n\n");
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write");
        }
    }
}
