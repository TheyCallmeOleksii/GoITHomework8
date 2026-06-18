public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАВДАННЯ 1: MyArrayList ===");
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("Яблуко");
        arrayList.add("Банан");
        System.out.println("Розмір MyArrayList: " + arrayList.size());
        System.out.println("Елемент [1]: " + arrayList.get(1));

        System.out.println("\n=== ЗАВДАННЯ 2: MyLinkedList ===");
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("Вагон 1");
        linkedList.add("Вагон 2");
        System.out.println("Розмір MyLinkedList: " + linkedList.size());
        System.out.println("Елемент [0]: " + linkedList.get(0));

        System.out.println("\n=== ЗАВДАННЯ 3: MyQueue (Черга) ===");
        MyQueue queue = new MyQueue();
        queue.add("Перший покупець");
        queue.add("Другий покупець");
        System.out.println("Перший у черзі (peek): " + queue.peek());
        System.out.println("Обслужили (poll): " + queue.poll());
        System.out.println("Залишилось у черзі: " + queue.size());

        System.out.println("\n=== ЗАВДАННЯ 4: MyStack (Стек) ===");
        MyStack stack = new MyStack();
        stack.push("Нижня тарілка");
        stack.push("Верхня тарілка");
        System.out.println("На верху лежить (peek): " + stack.peek());
        System.out.println("Взяли тарілку (pop): " + stack.pop());
        System.out.println("Залишилось тарілок: " + stack.size());

        System.out.println("\n=== ЗАВДАННЯ 5: MyHashMap ===");
        MyHashMap map = new MyHashMap();
        map.put("Київ", 3000000);
        map.put("Львів", 720000);
        System.out.println("Населення Києва: " + map.get("Київ"));
        System.out.println("Розмір мапи: " + map.size());
    }
}