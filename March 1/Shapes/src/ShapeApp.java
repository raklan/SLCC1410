import java.util.ArrayList;

public class ShapeApp {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3,6);
        Square square = new Square(5);
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(6);
        Circle circle = new Circle(5);

        System.out.println(rect.toString());

        System.out.println(square.toString());

        System.out.println(triangle.toString());
        System.out.println(triangle.hypotenuse());

        System.out.println(circle.toString());
        System.out.println(circle.circumference());

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(rect);
        shapes.add(square);
        shapes.add(triangle);
        shapes.add(circle);

        System.out.println("Shape Array:");
        System.out.println("------------");
        for(Shape s:shapes){
            System.out.println(s.toString());
            System.out.println("Perimeter: "+s.perimeter());
            System.out.println("Area: "+s.area());

            if(s instanceof Printable)
                ((Printable) s).print();

            System.out.println();
        }
    }
}
