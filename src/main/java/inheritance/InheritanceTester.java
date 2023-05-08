package inheritance;

import java_objects.Rectangle;

public class InheritanceTester {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        Square square = new Square();
        square.setLength(25);
        System.out.println(square.calculateParameter());

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        square.print("square");
    }
}