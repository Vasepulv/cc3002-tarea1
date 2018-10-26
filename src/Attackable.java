/**
 * This interface represents the workings of Attackable Objects, which can not attack, but can be attacked.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public interface Attackable extends GameElements {

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
     * Represents the action of a Attackable entity being attacked by an InfantryUnit.
     * @param infantryUnit that attacked the Attackable
     */
    void isAttackedByInfantryUnit(InfantryUnit infantryUnit);

    /**
     * Represents the action of a Attackable entity being attacked by an ArcherUnit.
     * @param archerUnit that attacked the Attackable entity
     */
    void isAttackedByArcherUnit(ArcherUnit archerUnit);

    /**
     * Represents the action of a Attackable entity being attacked by a Monk.
     * @param monk that "attacked" the Attackable entity
     */
    void isAttackedByMonk(Monk monk);

    /**
     * Represents the action of a Attackable entity being attacked by a CalvaryUnit.
     * @param calvaryUnit that attacked the Attackable Entity
     */
    void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit);

    /**
     * Represents the action of a Attackable entity being attacked by a SiegeUnit.
     * @param siegeUnit that attacked the Attackable entity
     */
    void isAttackedBySiegeUnit(SiegeUnit siegeUnit);

    /**
     * Represents the action of a Attackable entity being attacked by a Villager.
     * @param villager that attacked the Attackable entity
     */
    void isAttackedByVillager(Villager villager);

    /**
     * Represents the action of a Attackable entity being attacked by a Castle.
     * @param castle that attacked the Attackable entity
     */
    void isAttackedByCastle(Castle castle);
}
