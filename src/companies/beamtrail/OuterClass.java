package companies.beamtrail;

public class OuterClass {

    // Static nested class
    public static class StaticNestedClass {
        public void displayMessage() {
            System.out.println("Hello from the static nested class!");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.StaticNestedClass nestedInstance = new OuterClass.StaticNestedClass();
        nestedInstance.displayMessage();
    }
}

