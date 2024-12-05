// Shape class with common draw and erase methods
class Shape {
    // Method to draw the shape
    public void draw() {
        System.out.println("Drawing a shape");
    }

    // Method to erase the shape
    public void erase() {
        System.out.println("Erasing a shape");
    }
}

// Circle class, a subclass of Shape
class Circle extends Shape {
    // Overriding draw method for Circle
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Overriding erase method for Circle
    public void erase() {
        System.out.println("Erasing a circle");
    }
}

// Triangle class, a subclass of Shape
class Triangle extends Shape {
    // Overriding draw method for Triangle
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    // Overriding erase method for Triangle
    public void erase() {
        System.out.println("Erasing a triangle");
    }
}

// Square class, a subclass of Shape
class Square extends Shape {
    // Overriding draw method for Square
    public void draw() {
        System.out.println("Drawing a square");
    }

    // Overriding erase method for Square
    public void erase() {
        System.out.println("Erasing a square");
    }
}

// Main class to demonstrate polymorphism
public class Pgm5 {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape c = new Circle();      // Using Shape reference for Circle object
        Shape t = new Triangle();    // Using Shape reference for Triangle object
        Shape s = new Square();      // Using Shape reference for Square object

        // Demonstrating polymorphism by calling draw and erase methods
        System.out.println("Using Circle object:");
        c.draw();   // Circle's draw method
        c.erase();  // Circle's erase method

        System.out.println("\nUsing Triangle object:");
        t.draw();   // Triangle's draw method
        t.erase();  // Triangle's erase method

        System.out.println("\nUsing Square object:");
        s.draw();   // Square's draw method
        s.erase();  // Square's erase method
    }
}
