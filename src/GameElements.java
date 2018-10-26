/**
 * An interface that represents the basic actions that all elements in the game do.
 * @author Valentina Sepulveda
 * @version 1.0
 */
public interface GameElements {

    boolean isAlive();

    double getHitPoints();

    void isAttackedByInfantryUnit(InfantryUnit infantryUnit);

    void isAttackedByArcherUnit(ArcherUnit archerUnit);

    void isAttackedByMonk(Monk monk);

    void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit);

    void isAttackedBySiegeUnit(SiegeUnit siegeUnit);

    void isAttackedByVillager(Villager villager);

    void isAttackedByCastle(Castle castle);
}
