package game;


public class Enemy extends AbstractCharacter
{
    private Move currentDirection;

    public Enemy(int x, int y, boolean vertical) {
        // new instance of the Enemy class
        super(x, y, 1);
        // enemy moves vertically or horizontally.
        currentDirection = randomDirection(vertical);
    }

    public void changeDirection() {
        if (currentDirection == Move.DOWN) {
            currentDirection = Move.UP;
        } else if (currentDirection == Move.UP) {
            currentDirection = Move.DOWN;
        } else if (currentDirection == Move.LEFT) {
            currentDirection = Move.RIGHT;
        } else {
            currentDirection = Move.LEFT;
        }
    }

    public Move getCurrentDirection() {
        return currentDirection;
    }

    private Move randomDirection(boolean vertical) {
        assert Move.values().length == 4;
        int pick = (int) (Math.random() * (Move.values().length-2));
        if(vertical) {
            return Move.values()[pick];
        }
        else{
            return Move.values()[pick+2];
        }

    }
}
