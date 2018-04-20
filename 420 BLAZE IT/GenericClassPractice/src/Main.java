public class Main {

    public static void main(String[] args) {
	    GamePieces<String> monsters = new GamePieces<String>();
	    System.out.println(monsters.hasPieces());
	    monsters.addPiece("Vampire");
	    monsters.addPiece("Werewolf");
	    System.out.println(monsters.hasPieces());
	    System.out.println(monsters.getPiece(1));
    }
}