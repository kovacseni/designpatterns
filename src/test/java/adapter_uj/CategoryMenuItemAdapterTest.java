package adapter_uj;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CategoryMenuItemAdapterTest {

    @Test
    public void testAdapter() {
        List<Category> categories = List.of(
                new Category("Monitorok"),
                new Category("Billentyűzetek"),
                new Category("Gépházak"),
                new Category("Egerek"));

        List<MenuItem> menuItems = new CategoryMenuItemAdapter().adaptCategoriesToMenuItems(categories);

        assertThat(menuItems)
                .hasSize(4)
                .extracting(MenuItem::getTitle)
                .containsExactly("Monitorok", "Billentyűzetek", "Gépházak", "Egerek");
    }
}