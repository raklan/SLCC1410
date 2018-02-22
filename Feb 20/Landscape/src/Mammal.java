public class Mammal extends ClickableImage{

    private String imagePath;

    public Mammal(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x,y,w,h,path,n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        switch(this.getCount()){
            case 0:
                setImage("images/Bear.png");
                addToCount(1);
                break;
            case 1:
                setImage("images/elk.png");
                addToCount(1);
                break;
            case 2:
                setImage("images/Moose.png");
                addToCount(1);
                break;
            case 3:
                setImage("images/Wolf.png");
                resetCount();
                break;
        }
        repaint();
    }

}