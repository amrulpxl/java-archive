public class Generics {
    static class Box<T> {
        private T content;
        
        public void put(T content) {
            this.content = content;
        }
        
        public T get() {
            return content;
        }
    }
    
    static class Pair<K, V> {
        private final K key;
        private final V value;
        
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        
        public K getKey() {
            return key;
        }
        
        public V getValue() {
            return value;
        }
    }
    
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) return null;
        
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.put(123);
        System.out.println(intBox.get());
        
        Box<String> strBox = new Box<>();
        strBox.put("hello");
        System.out.println(strBox.get());
        
        Pair<String, Integer> pair = new Pair<>("age", 25);
        System.out.println(pair.getKey() + ": " + pair.getValue());
        
        Integer[] numbers = {1, 5, 3, 9, 2};
        System.out.println("max: " + findMax(numbers));
        
        String[] words = {"apple", "banana", "cherry"};
        System.out.println("max: " + findMax(words));
    }
}
