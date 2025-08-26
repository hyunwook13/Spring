package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("orange");
        list.add("banana");

        System.out.println(list.get(1)); // 출력: Banana

        // 중간 삭제 -> 뒤의 요소를 다 한칸씩 앞으로 이동 O(n)
        list.remove(0);
        System.out.println(list);
    }
}
