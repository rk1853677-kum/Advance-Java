// Class definition
class Counter {
    int count; // data member

    // Method to increment count
    void increment() {
        count++;
    }

    // Method to display count
    void display() {
        System.out.println("Count = " + count);
    }
}

// Main class
public class CounterDemo {
    public static void main(String[] args) {
        
        // Creating object of Counter class
        Counter c1 = new Counter();

        // Calling methods using object
        c1.increment();
        c1.increment();
        c1.increment();

        // Display result
        c1.display();
    }
}
