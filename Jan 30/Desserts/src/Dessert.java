import java.util.ArrayList;
import java.util.Scanner;

public abstract class Dessert {

    private String flavor;
    private ArrayList<String> ingredients = new ArrayList<>();

    protected boolean isStored;

    static Scanner scan = new Scanner(System.in);

    public Dessert(String f){
        flavor = f;
        setIngredients(this);

        isStored = false;
    }


    public String getIngredients(){
        String allIngredients = "";

        for(String s: ingredients){
            allIngredients += s+", ";
        }

        return allIngredients;
    }

    public String toString() {
        String theDessert = "This dessert is "+flavor+" flavored and is made with ";

        for(String s: ingredients){
            theDessert += s+", ";
        }

        return theDessert;
    }


    public void setIngredients(Dessert d){
        boolean done = false;
        String input = "";

        while(!done){

            if(d instanceof Cake)
                System.out.println("Enter the ingredient you want to add to this CAKE, or type 'done' to finish");
            else if(d instanceof Pie)
                System.out.println("Enter the ingredient you want to add to this PIE, or type 'done' to finish");
            else if(d instanceof Cookie)
                System.out.println("Enter the ingredient you want to add to this COOKIE, or type 'done' to finish");
            else if(d instanceof IceCream)
                System.out.println("Enter the ingredient you want to add to this ICE CREAM, or type 'done' to finish");


            input = scan.nextLine();
            if(input.equalsIgnoreCase("done"))
                done = true;
            else{
                ingredients.add(input);
            }
        }
    }

    public abstract void create();

    public abstract void prepare();

    public abstract void finish();

    public abstract void store(boolean b);
}