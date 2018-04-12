import java.util.Random;

public class Main {

    static String[][]map = new String[3][3];
    static Random gen = new Random();

    public static void main(String[] args) {

        map[0][0] = "Opening the Gate...squeak!";
        map[0][1] = "Gotta go through the river...splash, splash, splash";
        map[0][2] = "Gotta go through the woods...rustle, rustle, rustle";
        map[1][0] = "Gotta go through the mud...squish, squish, squish";
        map[1][1] = "Gotta go over the hill...climb, climb, climb";
        map[1][2] = "Gotta go through Sean's house...Hi Sean!";
        map[2][0] = "Gotta go through the grasslands...swish, swish, swish";
        map[2][1] = "Gotta go past the sleeping bear...tiptoe, tiptoe, tiptoe";
        map[2][2] = "There's a creepy guy! Run!";

        System.out.println("Goin' on a treasure hunt, gonna find the Gold!");
        adventure(0,0);
        System.out.println("Nothing like home sweet home!");
    }

    //Row = 1, Column = 0
    public static void adventure(int row, int column){
        int choice = gen.nextInt(1);

        System.out.println(row+", "+column);
        System.out.println(map[row][column]);
        if(row==2&&column==2)
            return;
        else if(choice==0&&column!=2)
            adventure(row, column+1);
        else if(choice==0&&column==2&&row!=2)
            adventure(row+1, column);
        else if(choice==1&&row!=2)
            adventure(row+1, column);
        else if(choice==1&&row==2&&column!=2)
            adventure(row, column+1);
        System.out.println(row+", "+column);
        System.out.println(map[row][column]);
    }

}