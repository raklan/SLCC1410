import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Counter extends JComponent implements ActionListener{

    private int count;
    private DoubleDigit nums;

    private World theWorld;

    private static Random gen = new Random();

    public Counter(int x, int y, World w){
        super();
        setBounds(x,y, 200,200);

        theWorld = w;
        nums = new DoubleDigit(0,0);
        add(nums, 0);

        count = 0;
        nums.setValue(count);
    }

    private void add1(){
        count ++;
    }
    private void reset(){
        count = 0;
    }
    public int getCount(){
        return count;
    }

    private void updateNumber(){
        if(count>=100)
            count = 0;
        nums.setValue(count);
        nums.setColors(count/10);
    }
    private void changeColors(){
        nums.setColors(gen.nextInt(10));
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==(theWorld.countButton)){
            add1();
        }
        else if(e.getSource()==(theWorld.colorButton)){
            changeColors();
        }
        else {
            reset();
        }

        updateNumber();
    }
}
