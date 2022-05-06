package bridge.docbook;

import bridge.Title;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class DocBookTitle implements Title {

    private Writer writer;

    public DocBookTitle(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void setContent(String content) {
        try (BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write("<title>" + content + "</title>");
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write");
        }
    }
}
