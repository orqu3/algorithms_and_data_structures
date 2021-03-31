package lesson_five;

public class Backpack {

    private Item[] items;

    public Backpack(Item[] items) {
        this.items = items;
    }

    public int findMaxCost(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > weight) {
            return findMaxCost(i - 1, weight);
        } else {
            return Math.max(findMaxCost(i - 1, weight),
                    findMaxCost(i - 1, weight - items[i].weight) + items[i].price);
        }
    }
}
