package lesson_three;

/*
1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
2. Создать класс для реализации дека.
 */


public class Main {

    private static final StringBuilder sb = new StringBuilder();
    private static final MyStack<Character> stack = new MyStack<>();

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }

    public static String reverse(String s) {
        sb.delete(0, sb.length());

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

