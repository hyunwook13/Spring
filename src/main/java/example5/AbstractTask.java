package example5;

public abstract class AbstractTask {
    public abstract void execute();
    public void start() {
        System.out.println("Task 시작");
    }
}
