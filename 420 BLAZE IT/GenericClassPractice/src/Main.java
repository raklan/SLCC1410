public class Main {

	public static void main(String[] args) {

		GenericStack<String> monsters = new GenericStack<String>();
		System.out.println(monsters.isEmpty());
		monsters.push("Vampire");
		monsters.push("Werewolf");
		System.out.println(monsters.isEmpty());
		System.out.println(monsters.peek());
		System.out.println(monsters.pop());
	}
}