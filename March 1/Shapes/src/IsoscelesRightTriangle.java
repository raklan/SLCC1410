public class IsoscelesRightTriangle implements Shape, Printable{

    private final int leg;

    public IsoscelesRightTriangle(int l){
        leg = l;
    }

    public double hypotenuse(){
        return(Math.sqrt((leg*leg)+(leg*leg)));
    }

    public String toString(){
        return "IsoscelesRightTriangle("+leg+")";
    }

    @Override
    public void print() {
        for(int h = 1; h<leg+2;h++){
            for(int b = 1; b<h; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public double perimeter() {
        return leg+leg+hypotenuse();
    }

    @Override
    public double area() {
        return .5*(leg*leg);
    }
}
