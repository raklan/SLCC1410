import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame("Digital Clock");
	    frame.setBounds(50,50,565,200);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	    frame.setLayout(null);

	    frame.add(new Clock(0,25,475,100));
    }

	//beginning inclusive, end exclusive
}
