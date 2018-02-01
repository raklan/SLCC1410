public class IceCream extends Dessert {

    public IceCream(String flavor) {
        super(flavor);
    }

    public void make(){
        System.out.println("Ice Cream made!");
    }
    public void eat(){
        System.out.println("Ice Cream has been eaten!");
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
