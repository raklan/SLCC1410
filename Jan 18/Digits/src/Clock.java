import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Clock extends JComponent{

    boolean am = true;
    String time;

    java.util.Timer t = new Timer();
    int fps = 2;

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

    private Colon hour_minute;
    private Colon minute_second;

    public Clock(int x, int y, int w, int h){
        super();

        this.setBounds(x,y,w,h);
        this.setVisible(true);

        //Hours
        number0 = new Number(10,0, 0);
        number1 = new Number(80, 0,1);
        hour_minute = new Colon(155,0,10,100);
        //Minutes
        number2 = new Number(170, 0, 2);
        number3 = new Number(240, 0, 3);
        minute_second = new Colon(305,0,10,100);
        //Seconds
        number4 = new Number(320, 0, 4);
        number5 = new Number(400, 0, 5);

        this.add(hour_minute);
        this.add(minute_second);
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
