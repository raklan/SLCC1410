public class GamePieces<E>{
    private java.util.ArrayList<E> pieces;

    public GamePieces(){
        pieces = new java.util.ArrayList<E>();
    }
    public E getPiece(int index){
        return pieces.get(index);
    }
    public int numofPieces(){
        return pieces.size();
    }
    public void addPiece(E o){
        pieces.add(o);
    }
    public boolean hasPieces(){
        return !(pieces.size()==0);
    }
}