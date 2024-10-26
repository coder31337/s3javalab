class Shape {
    int area(int a) {
        return a * a;
    }

    int area(int l, int b) {
        return l * b;
    }

    float area(float r) {
        return 3.14F * r * r;
    }
}

public class P7Overload {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of rectangle = " + shape.area(30, 10));
        System.out.println("Area of square = " + shape.area(10));
        System.out.println("Area of circle = " + shape.area(4.5F));
    }
}
