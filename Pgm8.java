class Outerclass {
  // Outer class display method
  void display() {
      System.out.println("Outer class display");
  }

  // Inner class
  class Innerclass {
      // Inner class display method
      void display() {
          System.out.println("Inner class display");
      }
  }
}

public class Pgm8 {
  public static void main(String[] args) {
      // Create an instance of the outer class
      Outerclass outer = new Outerclass();
      outer.display(); // Call outer class display method

      // Create an instance of the inner class using the outer class instance
      Outerclass.Innerclass inner = outer.new Innerclass();
      inner.display(); // Call inner class display method
  }
}
