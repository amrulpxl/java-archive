public class Strings {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0, 5));
        System.out.println(str.replace("Hello", "Hi"));
        System.out.println(str.contains("World"));
        System.out.println(str.indexOf("World"));
        
        String[] parts = str.split(", ");
        for (String part : parts) {
            System.out.println(part);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());
    }
}
