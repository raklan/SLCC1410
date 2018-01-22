import javax.swing.*;

public class Digit extends JComponent{

    private Rectangle bottom;
    private Rectangle bottomLeft;
    private Rectangle bottomRight;
    private Rectangle center;
    private Rectangle topRight;
    private Rectangle topLeft;
    private Rectangle top;

    public Digit(int x, int y){
        super();
        this.setBounds(x,y,60,100);

        bottom = new Rectangle(0,85,60,15);
        bottomRight = new Rectangle(45,50,15,50);
        bottomLeft = new Rectangle(0,50,15,50);
        center = new Rectangle(0,43,60,15);
        topRight = new Rectangle(45,0,15,50);
        topLeft = new Rectangle(0,0,15,50);
        top = new Rectangle(0,0,60,15);

        this.add(bottom);
        this.add(bottomLeft);
        this.add(bottomRight);
        this.add(center);
        this.add(top);
        this.add(topRight);
        this.add(topLeft);
    }

    protected void setDigit(long n){
        if(n==1){
            bottom.setVisible(false);
            bottomLeft.setVisible(false);
            bottomRight.setVisible(true);
            center.setVisible(false);
            topLeft.setVisible(false);
            topRight.setVisible(true);
            top.setVisible(false);
        }
        else if(n==2){
            bottom.setVisible(true);
            bottomLeft.setVisible(true);
            bottomRight.setVisible(false);
            center.setVisible(true);
            topLeft.setVisible(false);
            topRight.setVisible(true);
            top.setVisible(true);
        }
        else if(n==3){
            bottom.setVisible(true);
            bottomLeft.setVisible(false);
            bottomRight.setVisible(true);
            center.setVisible(true);
            topLeft.setVisible(false);
            topRight.setVisible(true);
            top.setVisible(true);
        }
        else if(n==4){
            bottom.setVisible(false);
            bottomLeft.setVisible(false);
            bottomRight.setVisible(true);
            center.setVisible(true);
            topLeft.setVisible(true);
            topRight.setVisible(true);
            top.setVisible(false);
        }
        else if(n==5){
            bottom.setVisible(true);
            bottomLeft.setVisible(false);
            bottomRight.setVisible(true);
            center.setVisible(true);
            topLeft.setVisible(true);
            topRight.setVisible(false);
            top.setVisible(true);
        }
        else if(n==6){
            bottom.setVisible(true);
            bottomLeft.setVisible(true);
            bottomRight.setVisible(true);
            center.setVisible(true);
            topLeft.setVisible(true);
            topRight.setVisible(false);
            top.setVisible(true);
        }
        else if(n==7){
            bottom.setVisible(false);
            bottomLeft.setVisible(false);
            bottomRight.setVisible(true);
            center.setVisible(false);
            topLeft.setVisible(false);
            topRight.setVisible(true);
            top.setVisible(true);
        }
        else if(n==8){
            this.visibility(true);
        }
        else if(n==9){
            bottom.setVisible(true);
            bottomLeft.setVisible(false);
            bottomRight.setVisible(true);
            center.setVisible(true);
            topLeft.setVisible(true);
            topRight.setVisible(true);
            top.setVisible(true);
        }
        else if(n==0){
            bottom.setVisible(true);
            bottomLeft.setVisible(true);
            bottomRight.setVisible(true);
            center.setVisible(false);
            topLeft.setVisible(true);
            topRight.setVisible(true);
            top.setVisible(true);
        }
    }

    protected void visibility(boolean v){
        bottom.setVisible(v);
        bottomLeft.setVisible(v);
        bottomRight.setVisible(v);
        center.setVisible(v);
        topLeft.setVisible(v);
        topRight.setVisible(v);
        top.setVisible(v);
    }
}