public class Variables {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14159265359;
        boolean bool = true;
        char c = 'A';
        
        System.out.printf("byte: %d%nshort: %d%nint: %d%nlong: %d%n", b, s, i, l);
        System.out.printf("float: %f%ndouble: %f%n", f, d);
        System.out.printf("boolean: %b%nchar: %c%n", bool, c);
    }
}
