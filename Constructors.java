public class Constructors {
    static class Car implements AutoCloseable {
        private String brand;
        private String model;
        private int year;
        private boolean isRegistered;
        
        Car() {
            this("unknown", "unknown", 2000);
        }
        
        Car(String brand, String model) {
            this(brand, model, 2023);
        }
        
        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.register();
        }
        
        private void register() {
            this.isRegistered = true;
            System.out.println("car registered: " + brand + " " + model);
        }
        
        @Override
        public void close() {
            if (isRegistered) {
                System.out.println("deregistering car: " + brand + " " + model);
                isRegistered = false;
            }
        }
        
        @Override
        public String toString() {
            return brand + " " + model + " (" + year + ")";
        }
    }
    
    public static void main(String[] args) {
        try (Car car1 = new Car();
             Car car2 = new Car("toyota", "camry");
             Car car3 = new Car("honda", "civic", 2022)) {
            
            System.out.println("\nregistered Cars:");
            System.out.println("car 1: " + car1);
            System.out.println("car 2: " + car2);
            System.out.println("car 3: " + car3);
        } 
    }
}
