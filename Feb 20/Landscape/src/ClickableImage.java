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

    public String getImage(){
        return name;
    }

    public abstract void changeImage();

    @Override
    public void mouseClicked(MouseEvent e) {

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
