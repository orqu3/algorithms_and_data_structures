package lesson_eight;

import java.util.Random;

public class Main {
    static Random random;
    public static void main(String[] args) {
        random = new Random();
        ChainingHashMap<Integer, String> chm= new ChainingHashMap<>(7);
        chm.put(1, "one");
        chm.put(2, "two");
        chm.put(3, "three");
        System.out.println(chm);
        chm.remove(3);
        System.out.println(chm);
    }
}
