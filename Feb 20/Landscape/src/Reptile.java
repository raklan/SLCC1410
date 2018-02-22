public class Reptile extends ClickableImage {

    private String imagePath;

    public Reptile(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x,y,w,h,path,n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        switch(this.getCount()){
            case 0:
                setImage("images/turtle.png");
                addToCount(1);
                break;
            case 1:
                setImage("images/frog.png");
                addToCount(1);
                break;
            case 2:
                setImage("images/alligator.png");
                resetCount();
                break;
        }
        repaint();
    }
}