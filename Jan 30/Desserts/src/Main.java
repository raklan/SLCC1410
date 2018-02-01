public class Main {

    public static void main(String[] args) {

        Dessert theCake = new Cake("Chocolate");
        Dessert theIceCream = new IceCream("Vanilla");
        Dessert thePie = new Pie("Cherry");
        Dessert theCookie = new Cookie("Peanut Butter");

        System.out.println(theCake.toString());
        System.out.println(thePie.toString());
        System.out.println(theIceCream.toString());
        System.out.println(theCookie.toString());

    }

}
