package game;

/**
 * This class represents the explosion, or the "fireballs", that are capable of killing an Enemy or a Player,
 * as well as destroying BREAKABLEBLOCKs. It needs a row and column -index that is used for logic and painting.
 * Its duration represents how many timesteps it will exist before it is removed.
 */
public class Explosion
{
    private int rowIndex;
    private int colIndex;
    private int duration = 5;

    public Explosion(int rowIndex, int colIndex)
    {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }
    //  returns the row index of the explosion.

    public int getColIndex() {
        return colIndex;
    }
    // returns the column index of the explosion.

    public int getDuration() {
        return duration;
    }
    // returns the duration of the explosion.

    public void setDuration(final int duration) {
        this.duration = duration;
    }
    // The setDuration(int duration) method is
}
