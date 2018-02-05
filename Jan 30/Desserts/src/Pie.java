public class Pie extends Dessert{

    private boolean isCold;

    public Pie(String flavor){
        super(flavor);
        isCold = true;
    }

    public void bake(){
        System.out.println("Pie has been BAKED!");
    }
    public void eat(){
        System.out.println("Pie has been eaten!");
    }

    @Override
    public void create(){
        System.out.println("Cake created!");
    }

    @Override
    public void finish() {
        System.out.println("Cake Finished!");
    }

    @Override
    public void store(boolean b){
        isStored = true;
    }

    @Override
    public void prepare(){
        System.out.println("Pie Prepared!");
    }

    public String toString(){
        String theString = super.toString()+" is Pie and ";
        if(isCold)
            theString+= "IS a cold Pie";
        else
            theString += "IS NOT a cold Pie";

        return theString;
    }

}