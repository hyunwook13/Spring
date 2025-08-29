package DI;

public class DIExampleUsingExtends {
        public static void main(String[] args) {
            // 실제 운영용
//            MenuService service = new MenuServiceImpl();
//            MenuController controller = new MenuController(service);
//            System.out.println("==실제 운영 예시==");
//            controller.printMenus();

            // 테스트용 또는 Stub 교체
            MenuService stubService = new MenuServiceStub();
            MenuController testController = new MenuController(stubService);
            System.out.println("\n==테스트용 혹은 Stub 예시==");
            testController.printMenus();

    }
}
