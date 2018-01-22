import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends JComponent{

    boolean am = true;
    String time;

    java.util.Timer t = new Timer();
    int fps = 60;

    long hour;
    long minute;
    long second;

    long totalMilliseconds;
    long totalSeconds;
    long totalMinutes;
    long totalHours;

    private Number number0;
    private Number number1;
    private Number number2;
    private Number number3;
    private Number number4;
    private Number number5;

    public Clock(int x, int y, int w, int h){
        super();

        this.setBounds(x,y,w,h);
        this.setVisible(true);

        number0 = new Number(10,50, 0);
        number1 = new Number(80, 50,1);
        number2 = new Number(180, 50, 2);
        number3 = new Number(250, 50, 3);
        number4 = new Number(350, 50, 4);
        number5 = new Number(420, 50, 5);

        this.add(number0);
        this.add(number1);
        this.add(number2);
        this.add(number3);
        this.add(number4);
        this.add(number5);

        t.schedule(new MyTimerTask(), 0, fps);
    }

    private void calculateTime(){
        am = true;

        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        hour  = totalHours % 24;
        hour-=7;

        if(hour>12){
            hour-=12;
            am = false;
        }
    }

    public void act(){
        calculateTime();

        if(hour<=9){
            number0.visibility(false);
            number1.setDigit(hour);
        }
        else{
            number0.setDigit(1);
            number1.setDigit(hour-10);
        }

        number2.setDigit(minute/10);
        number3.setDigit(minute%10);

        number4.setDigit(second/10);
        number5.setDigit(second%10);

    }

    public class MyTimerTask extends TimerTask
    {
        @Override
        public void run()
        {
            act();
        }
    }

}
