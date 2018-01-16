public class Main {

    public static void main(String[] args) {
	    makeRectangle(100000000,5);
    }
    public static void makeRectangle(int length, int height){

        for(int r = 0;r<height;r++){
            for(int c = 0;c<length;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
