public class MyHashMap<K, V> {
    private Node<K, V>[] buckets;
    private int size;
    private static final float LOAD_FACTOR = 0.75f;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Node[16];
        size = 0;
    }

    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getBucketIndex(K key, int capacity) {
        if (key == null) return 0;
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        if (size >= buckets.length * LOAD_FACTOR) {
            resize();
        }

        int index = getBucketIndex(key, buckets.length);
        Node<K, V> head = buckets[index];
        Node<K, V> current = head;

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
        size++;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        Node<K, V>[] oldBuckets = buckets;
        buckets = new Node[oldBuckets.length * 2];
        size = 0;
        for (Node<K, V> headNode : oldBuckets) {
            Node<K, V> current = headNode;
            while (current != null) {
                put(current.key, current.value);
                current = current.next;
            }
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key, buckets.length);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key, buckets.length);
        Node<K, V> current = buckets[index];
        Node<K, V> prev = null;

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

    @SuppressWarnings("unchecked")
    public void clear() {
        buckets = new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }
}