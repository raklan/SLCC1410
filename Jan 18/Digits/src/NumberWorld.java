import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class NumberWorld extends JComponent{

    static private Random gen = new Random();
    private Number zero;
    private Number one;
    private Number two;
    private Number three;
    private Number four;
    private Number five;
    private Number six;
    private Number seven;
    private Number eight;
    private Number nine;

    private ArrayList<Number> allNums = new ArrayList<>();

    public NumberWorld(){
        super();
        setBounds(0,0,1000,1000);
        setVisible(true);

        zero = new Number(gen.nextInt(800)+50,gen.nextInt(800)+50,0,gen.nextInt(10));
        one = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 1, gen.nextInt(10));
        two = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 2, gen.nextInt(10));
        three = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 3, gen.nextInt(10));
        four = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 4, gen.nextInt(10));
        five = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 5, gen.nextInt(10));
        six = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 6, gen.nextInt(10));
        seven = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 7, gen.nextInt(10));
        eight = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 8, gen.nextInt(10));
        nine = new Number(gen.nextInt(800)+50, gen.nextInt(800)+50, 9, gen.nextInt(10));

        allNums.add(zero);
        allNums.add(one);
        allNums.add(two);
        allNums.add(three);
        allNums.add(four);
        allNums.add(five);
        allNums.add(six);
        allNums.add(seven);
        allNums.add(eight);
        allNums.add(nine);

        for(Number n: allNums){
            add(n);
        }
    }
}
