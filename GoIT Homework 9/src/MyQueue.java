public class MyQueue<E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    public void add(E value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E peek() {
        if (head == null) return null;
        return head.value;
    }

    public E poll() {
        if (head == null) return null;
        E firstValue = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return firstValue;
    }
}