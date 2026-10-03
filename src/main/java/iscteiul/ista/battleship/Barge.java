/**
 *
 */
package iscteiul.ista.battleship;

/**
 * Represents the <a href="https://en.wikipedia.org/wiki/Barge">Barge</a> ship type, this
 * class inherits the abstract class Ship
 * @see Ship
 */
public class Barge extends Ship {
    private static final Integer SIZE = 1;
    private static final String NAME = "Barca";

    /**
     * @param bearing - barge bearing
     * @param pos     - upper left position of the Barge
     */
    public Barge(Compass bearing, IPosition pos) {
        super(Barge.NAME, bearing, pos);
        getPositions().add(new Position(pos.getRow(), pos.getColumn()));
    }

    @Override
    public Integer getSize() {
        return SIZE;
    }

}
