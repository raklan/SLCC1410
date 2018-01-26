import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Digit extends JComponent{

    private Rectangle bottom;
    private Rectangle bottomLeft;
    private Rectangle bottomRight;
    private Rectangle center;
    private Rectangle topRight;
    private Rectangle topLeft;
    private Rectangle top;

    private int c;

    private ArrayList<Rectangle> allRects = new ArrayList<>();

    private final int RED = 0;
    private final int BLUE = 1;
    private final int LIGHT_GRAY = 2;
    private final int BLACK = 3;
    private final int MAGENTA = 4;
    private final int CYAN = 5;
    private final int YELLOW = 6;
    private final int GREEN = 7;
    private final int ORANGE = 8;
    private final int PINK = 9;

    public Digit(int x, int y, int color){
        super();
        this.setBounds(x,y,60,100);
        c = color;

        bottom = new Rectangle(0,85,60,15);
        bottomRight = new Rectangle(45,50,15,50);
        bottomLeft = new Rectangle(0,50,15,50);
        center = new Rectangle(0,43,60,15);
        topRight = new Rectangle(45,0,15,50);
        topLeft = new Rectangle(0,0,15,50);
        top = new Rectangle(0,0,60,15);

        allRects.add(bottom);
        allRects.add(bottomRight);
        allRects.add(bottomLeft);
        allRects.add(center);
        allRects.add(topRight);
        allRects.add(topLeft);
        allRects.add(top);

        setColor(c);

        for(Rectangle r: allRects){
            add(r);
        }
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
        for(Rectangle r: allRects){
            r.setVisible(v);
        }
    }

    public void setColor(int c){
        switch(c){
            case RED:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.RED);
                }
                break;
            }
            case BLUE:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.BLUE);
                }
                break;
            }
            case LIGHT_GRAY:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.LIGHT_GRAY);
                }
                break;
            }
            case BLACK:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.BLACK);
                }
                break;
            }
            case MAGENTA:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.MAGENTA);
                }
                break;
            }
            case CYAN:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.CYAN);
                }
                break;
            }
            case YELLOW:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.YELLOW);
                }
                break;
            }
            case GREEN:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.GREEN);
                }
                break;
            }
            case ORANGE:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.ORANGE);
                }
                break;
            }
            case PINK:{
                for(Rectangle r: allRects){
                    r.setBackground(Color.PINK);
                }
                break;
            }
        }

    }

}