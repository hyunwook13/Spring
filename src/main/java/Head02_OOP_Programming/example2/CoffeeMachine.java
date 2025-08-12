package Head02_OOP_Programming.example2;

import java.time.LocalDateTime;

public class CoffeeMachine {
    private String machineName;
    private String color;
    private int weight;
    private int degree = 0;
    private String company;
    private int beanCapacity = 0;
    private boolean isOn = false;
    private int waterCapacity = 0;
    private LocalDateTime lastCleanedTime;
    private int beanTrashCapacity = 0;
    private String bean;
    private String[] coffeeType;
    private int coffeeSize;

    public CoffeeMachine(String machineName, String color, int weight, String company, LocalDateTime lastCleanedTime, String bean, String[] coffeeType) {
        this.machineName = machineName;
        this.color = color;
        this.weight = weight;
        this.company = company;
        this.lastCleanedTime = lastCleanedTime;
        this.bean = bean;
        this.coffeeType = coffeeType;
    }

    public void cleanUp() {
        lastCleanedTime = LocalDateTime.now();
        System.out.println("기계를 청소합니다. 위ㅣ이이이이이잉");
    }

    public boolean checkCapacity() {
        System.out.println("현재 원두는 " + beanCapacity + " 남았습니다.");
        System.out.println("현재 물은 " + waterCapacity + " 만큼 남았습니다.");
        System.out.println("현재 쓰레기통은 " + beanTrashCapacity + "만큼 찼습니다");

        return beanCapacity == 0 || beanCapacity - coffeeSize == 0 ||  beanTrashCapacity == 10;
    }
}
