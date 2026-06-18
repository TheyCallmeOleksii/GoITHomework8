public class MyQueue {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
    }

    public void add(Object value) {
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
    public Object peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }
    public Object poll() {
        if (head == null) {
            return null;
        }

        Object firstValue = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return firstValue;
    }
}