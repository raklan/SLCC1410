import javax.swing.*;

public class DoubleDigit extends JComponent{

    private Digit ones;
    private Digit tens;

    private int value;

    public DoubleDigit(int x, int y){
        super();
        setBounds(x,y, 150, 100);
        setVisible(true);

        tens = new Digit(0,0, 1);
        ones = new Digit(90,0, 1);

        add(tens, 0);
        add(ones, 0);

        value = 0;
    }

    public void setValue(int num){
        value = num;
        ones.setDigit(value%10);
        tens.setDigit(value/10);
    }
    public void setColors(int num){
        ones.setColor(num);
        tens.setColor(num);
    }
}