// File: MixedMethods.java
package mixed_package;

public class MixedMethods {
    private int instanceVariable;

    public MixedMethods() {
        this.instanceVariable = 0;
    }

    public void nonStaticMethod() {
        this.instanceVariable += 1;
        System.out.println("Non-static method called. Instance variable: " + this.instanceVariable);
    }

    public static void staticMethod1() {
        System.out.println("Static method 1 called.");
    }

    public static void staticMethod2() {
        System.out.println("Static method 2 called.");
    }

    public static void main(String[] args) {
        MixedMethods instance = new MixedMethods();
        instance.nonStaticMethod();
        staticMethod1();
        staticMethod2();
    }
}
