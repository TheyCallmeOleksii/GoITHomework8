public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        E value;
        Node next;
        Node prev;

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
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    private Node getNode(int index) {
        if (index < size / 2) {
            // Шукаємо з початку
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            Node current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }

    public E get(int index) {
        return getNode(index).value;
    }

    public void remove(int index) {
        Node current = getNode(index);

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        size--;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }
}