public class Cake extends Dessert{

    public Cake(String f){
        super(f);
    }

    public void bake(){
        System.out.println("Cake has been BAKED!");
    }
    public void eat(){
        System.out.println("Cake has been eaten!");
    }
}
