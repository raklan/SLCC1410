import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Dessert theCake = new Cake("Chocolate");
        Dessert theIceCream = new IceCream("Vanilla");
        Dessert thePie = new Pie("Cherry");
        Dessert theCookie = new Cookie("Peanut Butter");

        ArrayList<Dessert> allDesserts = new ArrayList<>();

        allDesserts.add(theCake);
        allDesserts.add(theIceCream);
        allDesserts.add(thePie);
        allDesserts.add(theCookie);

        for(Dessert d: allDesserts)
            System.out.println(d.toString());

    }

}