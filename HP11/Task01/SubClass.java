package another;

import example.AccessModifiersDemo;

public class SubClass extends AccessModifiersDemo {
    void accessTest() {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        System.out.println("Public: " + demo.publicVar);
        System.out.println("Protected (from subclass): " + this.protectedVar);
    }
}