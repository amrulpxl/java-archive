public class Polymorphism {
    static class Shape {
        double getArea() {
            return 0.0;
        }
        
        double getPerimeter() {
            return 0.0;
        }
    }
    
    static class Circle extends Shape {
        double radius;
        
        Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }
        
        @Override
        double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }
    
    static class Rectangle extends Shape {
        double width, height;
        
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        @Override
        double getArea() {
            return width * height;
        }
        
        @Override
        double getPerimeter() {
            return 2 * (width + height);
        }
    }
    
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6)
        };
        
        for (Shape shape : shapes) {
            System.out.println("area: " + shape.getArea());
            System.out.println("perimeter: " + shape.getPerimeter());
        }
    }
}
