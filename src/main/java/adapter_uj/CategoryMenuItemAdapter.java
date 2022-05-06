package adapter_uj;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryMenuItemAdapter implements MenuItem {

    private Category category;

    public CategoryMenuItemAdapter() {
    }

    public CategoryMenuItemAdapter(Category category) {
        this.category = category;
    }

    public List<MenuItem> adaptCategoriesToMenuItems(List<Category> categories) {
        return categories.stream()
                .map(c -> new CategoryMenuItemAdapter(c))
                .collect(Collectors.toList());
    }

    @Override
    public String getTitle() {
        return category.getName();
    }
}
