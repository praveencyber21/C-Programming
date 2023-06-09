package Learnings;

// Java Program to Illustrate Static Binding
 
// Main class
class NewClass {
 
    // Static nested inner class
    // Class 1
    static class superclass {
 
        // Method of inner class
        static void print()
        {
 
            // Print statement
            System.out.println(
                "print() in superclass is called");
        }
    }
 
    // Static nested inner class
    // Class 2
     static class subclass extends superclass {
 
        // Method of inner class
        static void print()
        {
 
            // print statement
            System.out.println(
                "print() in subclass is called");
        }
    }
 
    // Method of main class
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating objects of static inner classes
        // inside main() method
        // superclass A = new superclass();
        // superclass B = new subclass();
 
        // Calling method over above objects
        // A.print();
        // B.print();
    }
}