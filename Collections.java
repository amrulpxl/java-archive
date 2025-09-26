import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.addFirst("grape");
        System.out.println("LinkedList: " + linkedList);

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); 
        System.out.println("HashSet: " + hashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(List.of(3, 1, 4, 1, 5));
        System.out.println("TreeSet: " + treeSet);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap: " + treeMap);

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(List.of(3, 1, 4, 1, 5));
        System.out.println("PriorityQueue: " + priorityQueue);

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("first");
        deque.addLast("last");
        System.out.println("Deque: " + deque);

        List<Integer> numbers = new ArrayList<>(List.of(3, 1, 4, 1, 5, 9));
        java.util.Collections.sort(numbers);
        System.out.println("sorted: " + numbers);
        System.out.println("max: " + java.util.Collections.max(numbers));
        System.out.println("min: " + java.util.Collections.min(numbers));
        java.util.Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
    }
}
