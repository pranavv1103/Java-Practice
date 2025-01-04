class Parent {
    public Parent() {
        this(7);
        System.out.println("Parent non-parameterized constructor");
    }

    public Parent(int a) {
        //this(); // Calls Parent's non-parameterized constructor
        System.out.println("Parent parameterized constructor with value: " + a);
        
    }
}

class Child extends Parent {
    public Child() {
        super(); // Calls Parent's parameterized constructor
        System.out.println("Child non-parameterized constructor");
    }

    public Child(int a) {
        System.out.println("Child parameterized constructor with value: " + a);
    }
}

public class Sup {
    public static void main(String[] args) {
        Child obj = new Child(); // Calls Child's non-parameterized constructor
    }
}
