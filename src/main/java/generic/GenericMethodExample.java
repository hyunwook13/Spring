package generic;

public class GenericMethodExample {
     public static <U extends Comparable<U>> U max(U a, U b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20));         // 20 (Integer)
        System.out.println(max("apple", "pear")); // pear (String)
    }
}
