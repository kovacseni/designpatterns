package composite;

import java.util.List;

public class Title implements DocumentPart {

    private String content;

    public Title(String content) {
        this.content = content;
    }

    @Override
    public List<DocumentPart> getChildren() {
        return List.of();
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getContent() {
        return "# " + content + "\n";
    }

    @Override
    public String getPostfix() {
        return "";
    }
}