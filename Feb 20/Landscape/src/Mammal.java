public class Mammal extends ClickableImage{

    private String imagePath;

    public Mammal(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x,y,w,h,path,n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        if(imagePath.equalsIgnoreCase("images/Bear.png")){
            this.setImage("images/elk.png");
            imagePath = "images/elk.png";
        }
        else if(imagePath.equalsIgnoreCase("images/elk.png")){
            this.setImage("images/Moose.png");
            imagePath = "images/Moose.png";
        }
        else if(imagePath.equalsIgnoreCase("images/Moose.png")){
            this.setImage("images/Wolf.png");
            imagePath = "images/Wolf.png";
        }
        else if(imagePath.equalsIgnoreCase("images/Wolf.png")){
            this.setImage("images/Bear.png");
            imagePath = "images/Bear.png";
        }
        repaint();
    }

}
