import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JComponent implements ActionListener{

    private int count;
    private DoubleDigit nums;

    private World theWorld;

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

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource().equals(theWorld.countButton)){
            add1();
        }
        else {
            reset();
        }

        updateNumber();
    }
}
