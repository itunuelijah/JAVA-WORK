package gameEntry;

public class ScoreBoard {
    private int numOfEntries = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity){
        board = new GameEntry[capacity];
    }
    public void add(GameEntry enter) {
        int newScore = enter.getScore();
// is the new entry e really a high score?
        if (numOfEntries < board.length || newScore > board[numOfEntries - 1].getScore()) {
            if (numOfEntries < board.length)
                numOfEntries++;
// shift any lower scores rightward to make room for the new entry
            int j = numOfEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = enter;
        }
    }
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
            if (i < 0 || i >= numOfEntries)
                throw new IndexOutOfBoundsException("Invalid index: " + i);
            GameEntry temp = board[i]; // save the object to be removed
            for (int j = i; j < numOfEntries - 1; j++) // count up from i (not down)
            board[j] = board[j+1]; // move one cell to the left
            board[numOfEntries - 1 ] = null;
            numOfEntries --;
            return temp;
            // return the removed object
             }
}
