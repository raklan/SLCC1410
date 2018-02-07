import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PictureButton extends JFrame implements ActionListener{
    private JButton imgButton;
    private Icon clickImage;

    private Icon image1;

    private boolean isGif;

    public PictureButton(){
        super("Picture Button");
        isGif = false;
        setBounds(50,50,1000,1000);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        //This MAKES the pictures
        image1 = new ImageIcon(getClass().getResource("Image1.png"));
        Icon image2 = new ImageIcon(getClass().getResource("Image2.png"));
        clickImage = new ImageIcon(getClass().getResource("Image3.gif"));

        imgButton = new JButton(image1);
        imgButton.setBounds(0,0,1000,1000);
        imgButton.setVisible(true);
        imgButton.addActionListener(this);
        imgButton.setRolloverIcon(image2);

        add(imgButton, 0);
    }

    public void actionPerformed(ActionEvent e){
        if(!isGif) {
            imgButton.setIcon(clickImage);
            imgButton.setRolloverEnabled(false);
            isGif = true;
        }
        else{
            imgButton.setIcon(image1);
            imgButton.setRolloverEnabled(true);
            isGif = false;
        }
    }
}