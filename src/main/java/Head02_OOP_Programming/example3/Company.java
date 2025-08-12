package Head02_OOP_Programming.example3;

import java.util.List;

public class Company {
    private List<User> users;
    private String companyName;
    private int age;

    public Company(String companyName, int age, String ...username) {
        for(String n : username) {
            users.add(new User(n));
        }

        this.companyName = companyName;
        this.age = age;
    }
}
