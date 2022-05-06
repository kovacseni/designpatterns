package adapter_uj_felkesz;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        var categories = List.of(
                new Category("Monitorok"),
                new Category("Billentyűzetek"),
                new Category("Gépházak"),
                new Category("Egerek"));

        var menuItems = categories.stream()
                .map(c -> new CategoryMenuItemAdapter(c))
                .toList();
        new MenuDisplay().print(menuItems);
    }
}
