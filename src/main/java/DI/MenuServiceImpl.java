package DI;

import java.util.List;

public class MenuServiceImpl implements MenuService {
    @Override
    public List<String> getMenus() {
        return List.of("카페라떼, 아메리카노");
    }
}
