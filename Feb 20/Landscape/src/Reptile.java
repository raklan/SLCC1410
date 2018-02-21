public class Reptile extends ClickableImage {

    private String imagePath;

    public Reptile(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x,y,w,h,path,n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        if(imagePath.equalsIgnoreCase("images/alligator.png")){
            this.setImage("images/frog.png");
            imagePath = "images/frog.png";
        }
        else if(imagePath.equalsIgnoreCase("images/frog.png")){
            this.setImage("images/turtle.png");
            imagePath = "images/turtle.png";
        }
        else if(imagePath.equalsIgnoreCase("images/turtle.png")){
            this.setImage("images/alligator.png");
            imagePath = "images/alligator.png";
        }
        repaint();
    }
}
