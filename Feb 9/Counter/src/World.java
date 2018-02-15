import javax.swing.*;

public class World extends JFrame{

    private Counter theCounter;

    public JButton countButton;
    private JButton resetButton;
    public JButton colorButton;


    public World(){
        super("Counter");
        setBounds(50,50,1000,1000);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        theCounter = new Counter(100,100, this);
        countButton = new JButton("Add 1");
        resetButton = new JButton("Reset");
        colorButton = new JButton("Change Color");

        countButton.setBounds(50,0,100,100);
        resetButton.setBounds(250,0,100,100);
        colorButton.setBounds(550,0,100,100);

        countButton.setVisible(true);
        resetButton.setVisible(true);
        colorButton.setVisible(true);

        countButton.addActionListener(theCounter);
        resetButton.addActionListener(theCounter);
        colorButton.addActionListener(theCounter);

        add(theCounter,0);
        add(countButton,0);
        add(resetButton,0);
        add(colorButton,0);
    }

    public static void main(String[] args) {
	    new World();
    }
}
