//car is blueprint
//object is real value
/* 1. Static Memory Allocation
Definition: Memory is allocated at compile time. Once the program is compiled,
the memory is fixed and cannot be changed during runtime.
Location: Typically in the stack or data segment.
2. dynamic memory
Definition: Memory is allocated at runtime, allowing the program to request memory
 as needed and to release it when done.
Location: Typically in the heap.
Lifetime: Controlled by the program; the memory can be allocated and deallocated during runtime.
**method area (JVM) In Java, class blueprints, which include the class metadata
(like the structure of a class, its fields, methods, and the bytecode), are stored in a part
of memory called the Method Area.Here’s a breakdown of how this works and what memory areas
are involved:
1. Method Area
Definition: This is the memory region within the JVM (Java Virtual Machine) where class-level
information, such as bytecode, constants, static fields, and method definitions, are stored.
Contents:
Class metadata, including the blueprint of each class (field and method definitions).
Bytecode for methods.
Information on static variables (since they belong to the class, not instances).
Purpose: It provides the blueprint for creating instances (objects) of the class, and all
objects of a class share this common information.
Lifetime: The data stored in the Method Area
 is generally retained as long as the class is loaded by the JVM.

*/
public class CarClassObject {

    String colour;//properties instance variable and they can only be accessible by creating an instance(object) of the class
    int Speed;
    int Price;
    int fuel;

    public void addFuel(int a ) {
        fuel = a;
    }

    public void drive() {
        if (fuel > 0) {
            System.out.println("care is driving");
            fuel--;
        } else {
            System.out.println("car is out of fuel");
        }

    }

}
class Driving{
    public static void main(String[] args) {
        CarClassObject drive = new CarClassObject();
        drive.drive();
        drive.addFuel(3);
        drive.drive();
        drive.drive();
        drive.drive();
        drive.drive();
    }
}