public class Square extends Rectangle implements Shape, Printable{

    private final int side;

    public Square(int s){
        super(s,s);
        side = s;
    }

    public String toString(){
        return "Square("+side+")";
    }

}
