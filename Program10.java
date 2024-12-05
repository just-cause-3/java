Step 1: Create the Package (mypack)
File Name: Save the package file as MyClass.java in a directory named mypack.
Code for mypack/MyClass.java:



package mypack;

public class MyClass {
    public void display() {
        System.out.println("This is a message from mypack package");
    }
}


Step 2: Create the Main Program
File Name: Save the main program as Program10.java in the directory outside the mypack folder.


Code for Program10.java:



import mypack.MyClass;

public class Program10 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Create an object of MyClass
        obj.display();              // Access the method from the imported package
    }
}


Step 3: Directory Structure



<project-directory>/
│
├── mypack/
│   └── MyClass.java
│
└── Program10.java