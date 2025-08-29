package DI;

import java.util.List;

public class MenuServiceStub implements MenuService {
    @Override
    public List<String> getMenus() {
        return List.of("샘플1, 샘플2");
    }
}
