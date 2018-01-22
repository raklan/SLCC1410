public class Number extends Digit{

    protected int num;

    public Number(int x, int y, int n){
        super(x,y);
        num = n;
    }

    public void setNum(int n){
        num = n;
    }
    public int getNum(){
        return num;
    }

}