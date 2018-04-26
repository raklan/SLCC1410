public class Main {

	public static void main(String[] args) {

		GenericStack<String> monsters = new GenericStack<String>();
		monsters.printIsEmpty();
		monsters.push("Vampire");
		monsters.push("Werewolf");
		monsters.printIsEmpty();
		System.out.println(monsters.pop());
		monsters.push("Mummy");
		monsters.push("Zombie");
		System.out.println(monsters.peek());
		System.out.println(monsters.toString());
		System.out.println("If I called pop right now it would remove: "+monsters.peek());
		System.out.println(monsters.pop());
		System.out.println(monsters.toString());
	}
}