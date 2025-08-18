package stream_api_advanced_operation;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "이름은 " + name + " 나이는 " + age;
    }

    public int getAge() {
        return age;
    }
}
