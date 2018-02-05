public class Cookie extends Dessert {

    private String shape;

    public Cookie(String flavor){
        super(flavor);
        shape = "round";
    }

    public void bake(){
        System.out.println("Cookie has been BAKED!");
    }
    public void eat(){
        System.out.println("Cookie has been eaten!");
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
        System.out.println("Cookie Prepared!");
    }

    public String toString(){
        String theString = super.toString()+" is a Cookie and "+shape+" shaped.";
        return theString;
    }
}
