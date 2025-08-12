package Head02_OOP_Programming.example3;

public class User {
//    private String id;
    private String name;
//    private int age;
//    private int nickName;

    public User(String name) {
//        this.id = id;
        this.name = name;
//
    }

    public void printUserInfo() {
        System.out.println("이름: " + name);
    }
}
