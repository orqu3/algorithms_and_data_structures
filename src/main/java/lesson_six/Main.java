package lesson_six;

/*
1. Создать и запустить программу для построения двоичного дерева.
В цикле построить 200.000 деревьев с глубиной в 6 уровней.
Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.
2. Проанализировать, какой процент созданных деревьев являются несбалансированными.
 */


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 200_000; i++) {
            System.out.println(createSixLevelTreeMap().isBalanced());
        }
    }

    private static MyTreeMap<Integer, Integer> createSixLevelTreeMap() {
        MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
        int min = -100;
        int max = 100;
        int key = 1;
        while (map.height() < 5) {
            map.put(key, (int) (Math.random() * (max - min +1) + min));
            key++;
        }
        return map;
    }
}