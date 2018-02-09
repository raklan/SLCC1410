import javax.swing.*;

public class World extends JFrame{

    private Counter theCounter;
    public static JButton countButton;
    public static JButton resetButton;

    public static Number theOnesCount;
    public static Number theTensCount;

    public World(){
        super("Counter");
        setBounds(50,50,1000,1000);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        theCounter = new Counter();
        theOnesCount = new Number(150,100,theCounter.getCount(), 1);
        theTensCount = new Number(50,100,theCounter.getCount(), 1);
        countButton = new JButton("Add 1");
        resetButton = new JButton("Reset");

        countButton.setBounds(50,0,100,100);
        resetButton.setBounds(250,0,100,100);

        theOnesCount.setVisible(true);
        theTensCount.setVisible(true);
        countButton.setVisible(true);
        resetButton.setVisible(true);

        countButton.addActionListener(theCounter);
        resetButton.addActionListener(theCounter);

        add(theOnesCount,0);
        add(theTensCount,0);
        add(countButton,0);
        add(resetButton,0);
    }

    public static void main(String[] args) {
	    new World();
    }
}
