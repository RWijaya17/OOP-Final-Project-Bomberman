package game;

public class Bomb
    // bomb class
{
    // Constants are static by definition.
    private final static int BOMBSIZE = 30;
    // size of the bomb
    private final static int STARTCOUNTDOWN = 100;
    // countdown of 100
    private int timeToExplosion = STARTCOUNTDOWN;
    // time to explode
    private final int rowIndex;
    // return the row of the bomb's position
    private final int colIndex;
    // return the column of the bomb's position
    private int explosionRadius;
    // the bomb's explosion radius.
    private boolean playerLeft;
    // set to false

    public Bomb(final int rowIndex, final int colIndex, int explosionRadius) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
        this.explosionRadius = explosionRadius;
        playerLeft = false;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    // This method is static since every bomb has the same size.
    public static int getBOMBSIZE() {
        return BOMBSIZE;
    }
    // static method that returns the constant value of BOMBSIZE.

    public int getTimeToExplosion() {
        return timeToExplosion;
    }
    // returns the current time remaining until the bomb explodes.

    public void setTimeToExplosion(final int timeToExplosion) {
        this.timeToExplosion = timeToExplosion;
    }
    // sets the time remaining until the bomb explodes.
    public int getExplosionRadius() {
        return explosionRadius;
    }
    // returns the explosion radius of the bomb.

    public boolean isPlayerLeft() {
        return playerLeft;
    }
    // returns whether the player has left the bomb's position.

    public void setPlayerLeft(final boolean playerLeft) {
        this.playerLeft = playerLeft;
    }
    // sets the boolean value indicating whether the player has left the bomb's position.
}