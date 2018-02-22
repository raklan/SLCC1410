public class Bird extends ClickableImage {
    private String imagePath;
    public Bird(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x,y,w,h,path,n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        switch(this.getCount()){
            case 0:
                setImage("images/eagle.png");
                addToCount(1);
                break;
            case 1:
                setImage("images/goose.png");
                addToCount(1);
                break;
            case 2:
                setImage("images/heron.png");
                addToCount(1);
                break;
            case 3:
                setImage("images/owl.png");
                resetCount();
                break;
        }
        repaint();
    }
}