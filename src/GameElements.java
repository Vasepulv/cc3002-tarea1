/**
 * An interface that represents the basic actions that all elements in the game do.
 * @author Valentina Sepulveda
 * @version 1.0
 */
public interface GameElements {

    /**
     * Returns true if the entity that called it has positive hitPoints, false if not.
     * @return whether the entity is alive
     */
    boolean isAlive();

    /**
     *  Returns the hitPoints of the entity that called it.
     * @return hitPoints
     */
    double getHitPoints();

    /**
     * Represents the action of a Game Element being attacked by an InfantryUnit.
     * @param infantryUnit that attacked the GameElement
     */
    void isAttackedByInfantryUnit(InfantryUnit infantryUnit);

    /**
     * Represents the action of a Game Element being attacked by an ArcherUnit.
     * @param archerUnit that attacked the GameElement
     */
    void isAttackedByArcherUnit(ArcherUnit archerUnit);


    /**
     * Represents the action of a Game Element being attacked by a Monk.
     * @param monk that "attacked" the GameElement
     */
    void isAttackedByMonk(Monk monk);

    /**
     * Represents the action of a Game Element being attacked by a CalvaryUnit.
     * @param calvaryUnit that attacked the GameElement
     */
    void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit);

    /**
     * Represents the action of a Game Element being attacked by a SiegeUnit.
     * @param siegeUnit that attacked the Game Element
     */
    void isAttackedBySiegeUnit(SiegeUnit siegeUnit);

    /**
     * Represents the action of a Game Element being attacked by a Villager.
     * @param villager that attacked the GameElement
     */
    void isAttackedByVillager(Villager villager);

    /**
     * Represents the action of a Game Element being attacked by a Castle.
     * @param castle that attacked the GameElement
     */
    void isAttackedByCastle(Castle castle);
}
