import java.awt.event.*;

public abstract class ClickableImage extends ImagePanel implements MouseListener{

    protected int count;
    protected String name;
    protected PictureFrame win;

    public ClickableImage(String n, PictureFrame p){
        super();
        count = 0;
        name = n;
        win = p;
        addMouseListener(this);
    }
    public ClickableImage(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x,y,w,h,path);
        count = 0;
        name = n;
        win = p;
        addMouseListener(this);
    }

    public String getImageName(){
        return name;
    }

    public abstract void changeImage();

    protected int getCount(){
        return count;
    }
    protected void addToCount(int n){
        count+=n;
    }
    protected void resetCount(){count = 0;}

    @Override
    public void mouseClicked(MouseEvent e) {
        win.setLabelText(this.getImageName());
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e){

    }
    @Override
    public void mouseExited(MouseEvent e){

    }
}