public class MyStack<E> {
    private Object[] array;
    private int size;

    public MyStack() {
        array = new Object[10];
        size = 0;
    }

    public void push(E value) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public void clear() {
        array = new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (size == 0) return null;
        return (E) array[size - 1];
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if (size == 0) return null;
        E topPlate = (E) array[size - 1];
        array[size - 1] = null;
        size--;
        return topPlate;
    }
}