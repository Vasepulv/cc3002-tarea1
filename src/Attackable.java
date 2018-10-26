/**
 * This interface represents the workings of Attackable Objects, which can not attack, but can be attacked.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public interface Attackable extends GameElements {

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
