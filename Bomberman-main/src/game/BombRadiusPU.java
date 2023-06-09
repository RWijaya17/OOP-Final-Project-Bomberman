package game;

/**
 * This class extends AbstractPowerup and receives fundamental methods such as getters for its coordinates and size. This class
 * has an addToPlayer-method which adjusts the bombRadius of the player.
 */
public class BombRadiusPU extends AbstractPowerup
{

    public BombRadiusPU(int rowIndex, int colIndex) {
	super(colIndex, rowIndex);
    }

    public void addToPlayer(Player player) {
       // takes a Player object as a parameter and increases the player's explosion radius by 1.
        int currentExplosionRadius = player.getExplosionRadius();
	player.setExplosionRadius(currentExplosionRadius + 1);
    }

    public String getName() {
     //   returns the name of the power-up as a string. In this case, the name is "BombRadius".
	final String name = "BombRadius";
	return name;
    }
}
