public class Landscape extends ClickableImage{

    private String imagePath;

    public Landscape(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x, y, w, h, path, n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        switch(this.getCount()){
            case 0:
                setImage("images/MountainWinter.jpg");
                addToCount(1);
                break;
            case 1:
                setImage("images/MountainSummer.jpg");
                addToCount(1);
                break;
            case 2:
                setImage("images/MountainFall.jpg");
                resetCount();
                break;
        }
        repaint();
    }
}