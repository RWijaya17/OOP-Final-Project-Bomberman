package game;

public class AbstractCharacter
	// character in game
{
    private final static int SIZE = 30;
	// size of character
    private int x;
	// x coordinate
    private int y;
	// y coordinate
    private int pixelsPerStep;
	// the number of the character walk per step

    protected AbstractCharacter(int x, int y, int pixelsPerStep) {
		// initializes the character's position (x and y) and the number of pixels it moves per step
	this.x = x;
	this.y = y;
	this.pixelsPerStep = pixelsPerStep;
    }

    // Enum to represent different move directions
	public enum Move
    {
	DOWN(0, 1),
	UP(0, -1), 
	RIGHT(1, 0),
	LEFT(-1, 0);

	private final int deltaX;
	private final int deltaY;
	Move(final int deltaX, final int deltaY) {
	    this.deltaX = deltaX;
	    this.deltaY = deltaY;
	}
    }

	// Move method to update the position based on the given move direction
	public void move(Move move) {
	y += move.deltaY * pixelsPerStep;
	x += move.deltaX * pixelsPerStep;
    }

	// Move back method to reverse the previous move
	public void moveBack(Move currentDirection) {
	if (currentDirection == Move.DOWN) {
	    move(Move.UP);
	} else if (currentDirection == Move.UP) {
	    move(Move.DOWN);
	} else if (currentDirection == Move.LEFT) {
	    move(Move.RIGHT);
	} else if (currentDirection == Move.RIGHT) {
	    move(Move.LEFT);
	}
    }

	// Getter methods
    public int getSize() {
	return SIZE;
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public int getColIndex() {
	return Floor.pixelToSquare(x);
    }

    public int getRowIndex() {
	return Floor.pixelToSquare(y);
    }
}
