package example5;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("추상 클래스의 구현부");
            }
        };

        customTask.start();
        customTask.execute();
    }
}
