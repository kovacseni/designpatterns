package composite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Header implements DocumentPart {

    private Map<String, String> entries = new LinkedHashMap<>();

    public void addEntry(String name, String value) {
        entries.put(name, value);
    }

    @Override
    public List<DocumentPart> getChildren() {
        return List.of();
    }

    @Override
    public String getPrefix() {
        return "---\n";
    }

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        for (Map.Entry m : entries.entrySet()) {
            content.append(m.getKey()).append(": ").append(m.getValue()).append("\n");
        }
        return content.toString();
    }

    @Override
    public String getPostfix() {
        return "---\n\n";
    }
}
