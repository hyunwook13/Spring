package example6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        int[] arr = new int[3];

        List<String> lists = new ArrayList<String>();

        lists.add("apple");
        lists.add("banana");
        lists.add("cherry");

        System.out.println(lists.get(0));

        lists.remove(0);

        System.out.println(lists);

        System.out.println(lists.size());

        lists.clear();

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(Integer.valueOf(20));
        System.out.println("removed 20 → " + list);
    }
}
