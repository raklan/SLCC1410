import javax.swing.*;
import java.awt.*;

public class Main {

	static final String GRAY = "#878787";
	static final String YELLOW = "#d8cd00";
	static final String PURPLE = "#4c00aa";

    public static void main(String[] args) {
	    JFrame frame = new JFrame("Building");
	    frame.setLayout(null);
	    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	    frame.setBounds(50,50,1000,1000);
	    frame.setVisible(true);

	    Rectangle building = new Rectangle(100,100,800,800);
	    building.setVisible(true);
	    building.setBackground(Color.decode("#846300"));
	    frame.add(building);
    }
}
