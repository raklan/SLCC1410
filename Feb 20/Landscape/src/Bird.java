public class Bird extends ClickableImage {
    private String imagePath;
    public Bird(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x,y,w,h,path,n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        if(imagePath.equalsIgnoreCase("images/eagle.png")){
            this.setImage("images/goose.png");
            imagePath = "images/goose.png";
        }
        else if(imagePath.equalsIgnoreCase("images/goose.png")){
            this.setImage("images/heron.png");
            imagePath = "images/heron.png";
        }
        else if(imagePath.equalsIgnoreCase("images/heron.png")){
            this.setImage("images/owl.png");
            imagePath = "images/owl.png";
        }
        else if(imagePath.equalsIgnoreCase("images/owl.png")){
            this.setImage("images/eagle.png");
            imagePath = "images/eagle.png";
        }
        repaint();
    }
}
