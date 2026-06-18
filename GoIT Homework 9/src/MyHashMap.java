public class MyHashMap {
    private Node[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new Node[16];
        size = 0;
    }

    private class Node {
        Object key;
        Object value;
        Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getBucketIndex(Object key) {
        if (key == null) return 0;
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void put(Object key, Object value) {
        int index = getBucketIndex(key);
        Node head = buckets[index];

        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
        size++;
    }

    public Object get(Object key) {
        int index = getBucketIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(Object key) {
        int index = getBucketIndex(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        buckets = new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }
}