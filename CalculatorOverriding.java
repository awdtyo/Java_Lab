
public class CalculateArea {
    static void Square(int s) {
        System.out.println(s * s);
    }

    static void Rectangle(int l, int b) {
        System.out.println(l * b);
    }

    static void Circle(double r) {
        System.out.println(3.14 * r * r);
    }

    public static void main(String[] args) {
        System.out.println("Area of square: ");
        Square(5);
        System.out.println("Area of rectangle: ");
        Rectangle(4, 5);
        System.out.println("Area of Circle: ");
        Circle(4.00);

    }
}
