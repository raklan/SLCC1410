public class Landscape extends ClickableImage{

    private String imagePath;

    public Landscape(int x, int y, int w, int h, String path, String n, PictureFrame p){
        super(x, y, w, h, path, n,p);
        imagePath = path;
    }

    @Override
    public void changeImage(){
        if(imagePath.equalsIgnoreCase("images/MountainFall.jpg")){
            this.setImage("images/MountainSummer.jpg");
            imagePath = "images/MountainSummer.jpg";
        }
        else if(imagePath.equalsIgnoreCase("images/MountainSummer.jpg")){
            this.setImage("images/MountainWinter.jpg");
            imagePath = "images/MountainWinter.jpg";
        }
        else if(imagePath.equalsIgnoreCase("images/MountainWinter.jpg")){
            this.setImage("images/MountainFall.jpg");
            imagePath = "images/MountainFall.jpg";
        }
        repaint();
    }
}