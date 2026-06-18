public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАВДАННЯ 1: MyArrayList ===");
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Яблуко");
        arrayList.add("Банан");
        System.out.println("Розмір MyArrayList: " + arrayList.size());
        System.out.println("Елемент [1]: " + arrayList.get(1));

        System.out.println("\n=== ЗАВДАННЯ 2: MyLinkedList ===");
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Вагон 1");
        linkedList.add("Вагон 2");
        System.out.println("Розмір MyLinkedList: " + linkedList.size());
        System.out.println("Елемент [0]: " + linkedList.get(0));

        System.out.println("\n=== ЗАВДАННЯ 3: MyQueue ===");
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Перший покупець");
        queue.add("Другий покупець");
        System.out.println("Перший у черзі (peek): " + queue.peek());
        System.out.println("Обслужили (poll): " + queue.poll());

        System.out.println("\n=== ЗАВДАННЯ 4: MyStack ===");
        MyStack<String> stack = new MyStack<>();
        stack.push("Нижня тарілка");
        stack.push("Верхня тарілка");
        System.out.println("На верху лежить (peek): " + stack.peek());
        System.out.println("Взяли тарілку (pop): " + stack.pop());

        System.out.println("\n=== ЗАВДАННЯ 5: MyHashMap ===");
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Київ", 3000000);
        map.put("Львів", 720000);
        for (int i = 0; i < 20; i++) {
            map.put("Місто" + i, 100000 + i);
        }
        System.out.println("Населення Києва: " + map.get("Київ"));
        System.out.println("Загальний розмір мапи (перевірка розширення): " + map.size());
    }
}