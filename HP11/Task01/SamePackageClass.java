package example;

public class SamePackageClass {
    void accessTest() {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        System.out.println("Public: " + demo.publicVar);
        System.out.println("Protected: " + demo.protectedVar);
        System.out.println("Default: " + demo.defaultVar);
    }
}