public class Interfaces {
    interface Flyable {
        void fly();
        void land();
    }
    
    interface Swimmable {
        void swim();
        void dive();
    }
    
    static class Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("Bird is flying");
        }
        
        @Override
        public void land() {
            System.out.println("Bird has landed");
        }
    }
    
    static class Fish implements Swimmable {
        @Override
        public void swim() {
            System.out.println("Fish is swimming");
        }
        
        @Override
        public void dive() {
            System.out.println("Fish is diving");
        }
    }
    
    static class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("Duck is flying");
        }
        
        @Override
        public void land() {
            System.out.println("Duck has landed");
        }
        
        @Override
        public void swim() {
            System.out.println("Duck is swimming");
        }
        
        @Override
        public void dive() {
            System.out.println("Duck is diving");
        }
    }
    
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Duck duck = new Duck();
        
        bird.fly();
        bird.land();
        
        fish.swim();
        fish.dive();
        
        duck.fly();
        duck.swim();
        duck.land();
        duck.dive();
    }
}
