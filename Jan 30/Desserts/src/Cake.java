public class Cake extends Dessert{

    public Cake(String flavor){
        super(flavor);
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
}
