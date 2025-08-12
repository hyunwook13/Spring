package Head02_OOP_Programming.example3;

public class UserProfile extends User {
    private String id;

    public UserProfile(String username, String id) {
        super(username);
        this.id = id;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("id: " + id);
    }
}
