package companies.beamtrail;

class Parent {
    void print(String text) {
        System.out.println("String: " + text);
    }

    void print(int number) {
        System.out.println("Integer: " + number);
    }
}

class Child extends Parent {

    void print(int number) {
        System.out.println("I am a child" + number);
    }

    void print(float number) {
        System.out.println("Float: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.print(5);
        p = new Child();
        p.print((int) 2.3f);
    }
}

