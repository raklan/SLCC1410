import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PictureFrame extends JFrame implements ActionListener{

    private JLabel label;
    private JButton button;

    private ClickableImage landscape;
    private ClickableImage aminal;
    private ClickableImage birb;
    private ClickableImage lizardboi;

    private ClickableImage ci;

    public PictureFrame(){
        super("Picture Frame");
        setBounds(100,100,1500,700);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label = new JLabel("");
        label.setVisible(true);
        label.setBounds(1300,50,100,100);
        add(label,0);

        button = new JButton("Change Image");
        button.setVisible(true);
        button.setBounds(1250,150,200,100);
        add(button, 0);
        button.addActionListener(this);

        landscape = new Landscape(0,0,1200,700, "images/MountainFall.jpg","Landscape", this);
        add(landscape, 0);

        aminal = new Mammal(450,375,200,200, "images/Wolf.png","Mammal", this);
        add(aminal, 0);

        birb = new Bird(50,50,100,100, "images/goose.png","Bird", this);
        add(birb, 0);

        lizardboi = new Reptile(650,500,100,100, "images/alligator.png","Reptile", this);
        add(lizardboi, 0);

        ci = landscape;

        label.setText(ci.getImageName());
    }

    public static void main(String[]args){
        new PictureFrame();
    }

    public void changeObject(ClickableImage c){
        ci = c;
        label.setText(ci.getImageName());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            ci.changeImage();
    }
}