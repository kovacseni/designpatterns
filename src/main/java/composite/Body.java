package composite;

import java.util.ArrayList;
import java.util.List;

public class Body implements DocumentPart {

    private List<DocumentPart> documentParts;

    public void addDocumentPart(DocumentPart documentPart) {
        if (documentParts == null) {
            documentParts = new ArrayList<>();
        }
        documentParts.add(documentPart);
    }

    @Override
    public List<DocumentPart> getChildren() {
        return documentParts;
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getContent() {
        return "";
    }

    @Override
    public String getPostfix() {
        return "";
    }
}
