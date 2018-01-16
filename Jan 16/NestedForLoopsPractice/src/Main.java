public class Main {

    public static void main(String[] args) {
	    makeRectangle(9,3);
	    System.out.println();
	    makeTriangle(6);
        System.out.println();
	    rectangleOutline(12,12);
        System.out.println();
    }

    public static void makeRectangle(int length, int height){

        for(int r = 0;r<height;r++){
            for(int c = 0;c<length;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void makeTriangle(int height){
        for(int h = 1; h<height+2;h++){
            for(int b = 1; b<h; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rectangleOutline(int length, int height){
        for(int r = 0;r<height;r++){
            for(int c = 0;c<length;c++){
                if(r==0||r==height-1)
                    System.out.print("* ");
                else{
                    if(c==0||c==length-1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
