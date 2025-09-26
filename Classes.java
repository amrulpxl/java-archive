public class Classes {
    static class Person {
        String name;
        int age;
        
        void introduce() {
            System.out.println("i am " + name + ", " + age + " years old.");
        }
        
        void haveBirthday() {
            age++;
            System.out.println("happy birthday! now i am " + age);
        }
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Amrul";
        person.age = 21;
        
        person.introduce();
        person.haveBirthday();
        person.introduce();
    }
}
