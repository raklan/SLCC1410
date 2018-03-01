public class Rectangle implements Shape, Printable{

    private final int length;
    private final int width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }
    public String toString(){
        return"Rectagle("+length+"x"+width+")";
    }

    @Override
    public void print() {
        for(int r = 0;r<width;r++){
            for(int c = 0;c<length;c++){
                if(r==0||r==width-1)
                    System.out.print("* ");
                else{
                    if(c==0||c==length-1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    @Override
    public double perimeter() {
        return (length*2)+(width*2);
    }

    @Override
    public double area() {
        return (length*width);
    }
}
