public class Circle implements Shape{

    private final int radius;

    public Circle(int r){
        radius = r;
    }

    public double circumference(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "Circle("+radius+")";
    }

    @Override
    public double perimeter(){
        return circumference();
    }
    @Override
    public double area(){
        return Math.PI*(radius*radius);
    }

}
