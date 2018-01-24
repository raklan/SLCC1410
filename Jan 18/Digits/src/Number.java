public class Number extends Digit{

    protected int num;

    public Number(int x, int y, int n){
        super(x,y);
        num = n;
    }

    protected void setNum(int n){
        num = n;
    }
    protected int getNum(){
        return num;
    }

    public boolean equals(Object n){
        if(n==null)
            return false;
        if(n==this)
            return true;
        if(n instanceof Number){
            return ((Number)n).getNum() == this.getNum();
        }
        else
            return false;
    }

}