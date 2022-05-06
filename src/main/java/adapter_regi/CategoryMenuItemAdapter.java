package adapter_regi;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryMenuItemAdapter implements MenuItem {

    private Category category;

    private List<MenuItem> children;

    public CategoryMenuItemAdapter(Category category) {
        this.category = category;
    }

    @Override
    public List<MenuItem> getChildren() {
        if (children == null) {
            children = category.getSubcategories().stream().map(c -> new CategoryMenuItemAdapter(c)).collect(Collectors.toList());
        }
        return children;
    }

    @Override
    public String getName() {
        return category.getName();
    }

    @Override
    public int numberOfAllChildren() {
        int sum = 0;
        sum += getChildren().size();
        sum += getChildren().stream()
                .flatMap(c -> c.getChildren().stream())
                .toList()
                .size();
        return sum;
    }
}
