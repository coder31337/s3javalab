import java.util.Scanner;

abstract class Shapes {
    Scanner scanner = new Scanner(System.in);
    float dim1, dim2;

    abstract void printArea();
}

class Rectangle extends Shapes {
    void printArea() {
        System.out.print("Enter the length: ");
        dim1 = scanner.nextFloat();
        System.out.print("Enter the breadth: ");
        dim2 = scanner.nextFloat();
        float area = dim1 * dim2;
        System.out.println("Area of rectangle is " + area);
    }
}

class Triangle extends Shapes {
    void printArea() {
        System.out.print("Enter the base length: ");
        dim1 = scanner.nextFloat();
        System.out.print("Enter the height: ");
        dim2 = scanner.nextFloat();
        float area = 0.5F * dim1 * dim2;
        System.out.println("Area of triangle is " + area);
    }
}

class Circle extends Shapes {
    void printArea() {
        System.out.print("Enter the radius: ");
        dim1 = scanner.nextFloat();
        float area = 3.14F * dim1 * dim1;
        System.out.println("Area of circle is " + area);
    }
}

public class P10AbstractClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
