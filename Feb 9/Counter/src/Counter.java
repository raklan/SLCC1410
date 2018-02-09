import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter implements ActionListener{

    private int count;

    public Counter(){
        count = 0;
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
        if(count == 0){
            World.theOnesCount.setNum(getCount());
            World.theOnesCount.setDigit(getCount());

            World.theTensCount.setNum(getCount());
            World.theTensCount.setDigit(getCount());
        }
        else if(count<10) {
            World.theOnesCount.setNum(getCount());
            World.theOnesCount.setDigit(getCount());

            World.theTensCount.setNum(0);
            World.theTensCount.setDigit(0);
        }

        else if(count>=10&&count<20){
            World.theOnesCount.setNum(getCount());
            World.theOnesCount.setDigit(getCount());

            World.theTensCount.setNum(1);
            World.theTensCount.setDigit(1);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource().equals(World.countButton)){
            add1();
        }
        else {
            reset();
        }

        updateNumber();
    }
}
