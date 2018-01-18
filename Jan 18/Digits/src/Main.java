import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame("Digit");
	    frame.setBounds(50,50,1000,1000);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	    frame.setLayout(null);

	    Digit digit0 = new Digit(10,50);
	    Digit digit1 = new Digit(80, 50);
		Digit digit2 = new Digit(150, 50);
		Digit digit3 = new Digit(220, 50);
		Digit digit4 = new Digit(290, 50);
		Digit digit5 = new Digit(360, 50);
		Digit digit6 = new Digit(430, 50);
		Digit digit7 = new Digit(500, 50);
		Digit digit8 = new Digit(570, 50);
		Digit digit9= new Digit(640, 50);

	    frame.add(digit0);
	    frame.add(digit1);
		frame.add(digit2);
		frame.add(digit3);
		frame.add(digit4);
		frame.add(digit5);
		frame.add(digit6);
		frame.add(digit7);
		frame.add(digit8);
		frame.add(digit9);

		digit0.zero();
	    digit1.one();
	    digit2.two();
	    digit3.three();
	    digit4.four();
	    digit5.five();
	    digit6.six();
	    digit7.seven();
	    digit8.eight();
	    digit9.nine();
    }
}
