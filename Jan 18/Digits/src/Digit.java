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

    public void one(){
        bottom.setVisible(false);
        bottomLeft.setVisible(false);
        bottomRight.setVisible(true);
        center.setVisible(false);
        topLeft.setVisible(false);
        topRight.setVisible(true);
        top.setVisible(false);
    }
    public void two(){
        bottom.setVisible(true);
        bottomLeft.setVisible(true);
        bottomRight.setVisible(false);
        center.setVisible(true);
        topLeft.setVisible(false);
        topRight.setVisible(true);
        top.setVisible(true);
    }
    public void three(){
        bottom.setVisible(true);
        bottomLeft.setVisible(false);
        bottomRight.setVisible(true);
        center.setVisible(true);
        topLeft.setVisible(false);
        topRight.setVisible(true);
        top.setVisible(true);
    }
    public void four(){
        bottom.setVisible(false);
        bottomLeft.setVisible(false);
        bottomRight.setVisible(true);
        center.setVisible(true);
        topLeft.setVisible(true);
        topRight.setVisible(true);
        top.setVisible(false);
    }
    public void five(){
        bottom.setVisible(true);
        bottomLeft.setVisible(false);
        bottomRight.setVisible(true);
        center.setVisible(true);
        topLeft.setVisible(true);
        topRight.setVisible(false);
        top.setVisible(true);
    }
    public void six(){
        bottom.setVisible(true);
        bottomLeft.setVisible(true);
        bottomRight.setVisible(true);
        center.setVisible(true);
        topLeft.setVisible(true);
        topRight.setVisible(false);
        top.setVisible(true);
    }
    public void seven(){
        bottom.setVisible(false);
        bottomLeft.setVisible(false);
        bottomRight.setVisible(true);
        center.setVisible(false);
        topLeft.setVisible(false);
        topRight.setVisible(true);
        top.setVisible(true);
    }
    public void eight(){
        this.visibility(true);
    }
    public void nine(){
        bottom.setVisible(true);
        bottomLeft.setVisible(false);
        bottomRight.setVisible(true);
        center.setVisible(true);
        topLeft.setVisible(true);
        topRight.setVisible(true);
        top.setVisible(true);
    }
    public void zero(){
        bottom.setVisible(true);
        bottomLeft.setVisible(true);
        bottomRight.setVisible(true);
        center.setVisible(false);
        topLeft.setVisible(true);
        topRight.setVisible(true);
        top.setVisible(true);
    }

    public void visibility(boolean v){
        bottom.setVisible(v);
        bottomLeft.setVisible(v);
        bottomRight.setVisible(v);
        center.setVisible(v);
        topLeft.setVisible(v);
        topRight.setVisible(v);
        top.setVisible(v);
    }
}