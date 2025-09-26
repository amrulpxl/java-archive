public class Inheritance {
    static class Animal {
        String name;
        
        Animal(String name) {
            this.name = name;
        }
        
        void makeSound() {
            System.out.println("some sound horeg");
        }
    }
    
    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }
        
        @Override
        void makeSound() {
            System.out.println("woof!");
        }
        
        void fetch() {
            System.out.println(name + " is fetching the ball");
        }
    }
    
    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }
        
        @Override
        void makeSound() {
            System.out.println("meow!");
        }
        
        void climb() {
            System.out.println(name + " is climbing");
        }
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog("Markijang");
        Cat cat = new Cat("Botak");
        Animal animal = new Animal("GenericAnimal");
        
        dog.makeSound();
        dog.fetch();
        
        cat.makeSound();
        cat.climb();
        
        animal.makeSound();
    }
}
