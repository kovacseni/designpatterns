package adapter_uj_felkesz;

public class CategoryMenuItemAdapter implements MenuItem {

    private Category category;

    public CategoryMenuItemAdapter(Category category) {
        this.category = category;
    }

    @Override
    public String getTitle() {
        return category.getName();
    }
}
