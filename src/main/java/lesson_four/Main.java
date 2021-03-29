package lesson_four;

public class Main {
    public static void main(String[] args) {

        linkedListTest();
        linkedListStackTest();
        linkedListQueueTest();
    }

    private static void linkedListTest() {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.insertFirst(i);
        }
        System.out.println(ll.size());
        System.out.println(ll.toString());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.toString());
        ll.insertFirst(7);
        ll.insertLast(45);
        System.out.println(ll.toString());
        ll.remove(3);
        System.out.println(ll.toString());
    }

    private static void linkedListStackTest() {
        MyLinkedListStack<Integer> llStack = new MyLinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            llStack.push(i);
        }
        System.out.println(llStack.size());
        System.out.println(llStack.toString());
        System.out.println(llStack.pop());
        System.out.println(llStack.toString());
        llStack.push(7);
        llStack.push(45);
        System.out.println(llStack.toString());
        System.out.println(llStack.peek());
    }

    private static void linkedListQueueTest() {
        MyLinkedListQueue<Integer> llQueue = new MyLinkedListQueue<>();
        for (int i = 0; i < 5; i++) {
            llQueue.insert(i);
        }
        System.out.println(llQueue.size());
        System.out.println(llQueue.toString());
        System.out.println(llQueue.remove());
        System.out.println(llQueue.toString());
        llQueue.insert(7);
        llQueue.insert(45);
        System.out.println(llQueue.toString());
        System.out.println(llQueue.peek());
    }
}