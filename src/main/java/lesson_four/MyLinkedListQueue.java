package lesson_four;

public class MyLinkedListQueue<T> {

    private MyLinkedList<T> ll = new MyLinkedList<>();

    public boolean insert(T value) {
        ll.insertLast(value);
        return true;
    }

    public T remove() {
        return ll.removeFirst();
    }

    public T peek() {
        return ll.getFirst();
    }

    public int size() {
        return ll.size();
    }

    public boolean isEmpty() {
        return ll.isEmpty();
    }

    @Override
    public String toString() {
        return ll.toString();
    }
}
