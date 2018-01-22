import javax.swing.*;

public class Colon extends JComponent {

    private Rectangle top;
    private Rectangle bottom;

    public Colon(int x, int y, int w, int h){
        super();
        this.setBounds(x,y,w,h);
        this.setVisible(true);

        top = new Rectangle(0,19,10,10);
        bottom = new Rectangle(0,69,10,10);

        this.add(top);
        this.add(bottom);
    }

}
