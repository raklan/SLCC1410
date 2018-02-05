public class IceCream extends Dessert {

    private boolean isFrozen;

    public IceCream(String flavor) {
        super(flavor);
        isFrozen = true;
    }

    public void make(){
        System.out.println("Ice Cream made!");
    }
    public void eat(){
        System.out.println("Ice Cream has been eaten!");
    }

    @Override
    public void create(){
        System.out.println("Ice Cream created!");
    }

    @Override
    public void finish() {
        System.out.println("Ice Cream Finished!");
    }

    @Override
    public void store(boolean b){
        isStored = true;
    }

    @Override
    public void prepare(){
        System.out.println("Ice Cream Prepared!");
    }

    public String toString(){
        String theString = super.toString()+" is Ice Cream and ";
        if(isFrozen)
            theString+= "IS frozen";
        else
            theString += "IS NOT frozen";

        return theString;
    }

}
