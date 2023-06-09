package game;

/**
 * This class extends AbstractPowerup and receives fundamental methods such as getters for its coordinates and size. This class
 * has an addToPlayer-method which adjusts the bombCount of the player.
 */
public class BombCounterPU extends AbstractPowerup
    //  inheriting its properties and methods.
{

    public BombCounterPU(int rowIndex, int colIndex) {
	super(colIndex, rowIndex);
    }
    // takes the row index and column index as arguments and calls the constructor of the superclass (AbstractPowerup)
    // using super(colIndex, rowIndex) to initialize the position of the power-up.

    public void addToPlayer(Player player) {
	int currentBombCount = player.getBombCount();
    // increases the bomb count of the player by one,
        // and updates it using the setBombCount method of the Player class.
	player.setBombCount(currentBombCount + 1);
    }

    public String getName() {
        // It returns the name of the power-up, which is set to "BombCounter".
	final String name = "BombCounter";
	return name;
    }
}
