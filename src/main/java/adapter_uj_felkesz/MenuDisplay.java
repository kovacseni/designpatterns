package adapter_uj_felkesz;

import java.util.List;

public class MenuDisplay {

    public void print(List<?extends MenuItem> menuItems) {
        for(var item: menuItems) {
            System.out.println(item.getTitle());
        }
    }
}
