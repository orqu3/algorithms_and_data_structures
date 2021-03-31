package lesson_five;

/*
1. Написать программу по возведению числа в степень с помощью рекурсии.
2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
 */

public class Main {
    public static void main(String[] args) {

        testExponentiation();

        testBackpackTask();
    }

    private static void testBackpackTask() {
        Item[] items = {new Item(1, 3),
                new Item(15, 1),
                new Item(4, 10),
                new Item(8, 2),
                new Item(3, 20),
                new Item(14, 5)};

        Backpack backpack = new Backpack(items);
        int backpackCapacity = 18;
        System.out.println(backpack.findMaxCost(items.length - 1, backpackCapacity));
    }

    private static void testExponentiation() {
        System.out.println("3^2 = " + exponentiation(3, 2));
        System.out.println("12^0 = " + exponentiation(12, 0));
        System.out.println("5,9^7 = " + exponentiation(5.9, 7));
        System.out.println("10^-1 = " + exponentiation(10, -1));
        System.out.println("1,3^-3 = " + exponentiation(1.3, -3));
    }

    public static double exponentiation(double numb, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return numb;
        }
        if (exp == -1)
            return 1 / numb;
        if (exp > 1) {
            return exponentiation(numb, exp - 1) * numb;
        }
        return 1 / (numb * exponentiation(numb, -1 * (exp + 1)));
    }
}
