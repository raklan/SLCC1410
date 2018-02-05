public class Cake extends Dessert{

    private String shape;

    public Cake(String flavor){
        super(flavor);
        shape = "round";
    }

    public void bake(){
        System.out.println("Cake has been BAKED!");
    }
    public void eat(){
        System.out.println("Cake has been eaten!");
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
        System.out.println("Cake Prepared!");
    }

    public String toString(){
        String theString = super.toString()+" is Cake and "+shape+" shaped.";
        return theString;
    }

}
