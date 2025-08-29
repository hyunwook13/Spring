package DI;

public class MenuController {

    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    void printMenus() {
        menuService.getMenus().stream().forEach(System.out::println);
    }
}
