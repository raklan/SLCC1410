public class Cookie extends Dessert {

    public Cookie(String flavor){
        super(flavor);
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

}
