package algorithm;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(2);
        System.out.println(list); // 출력: [1, 3]
    }
}
