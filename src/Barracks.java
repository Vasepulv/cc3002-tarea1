/**
 * This class represents the Barracks, of the Building type.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public class Barracks extends Building implements Attackable {
    private int hitPoints;

    public Barracks(){

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void isAttackedByInfantryUnit(InfantryUnit infantryUnit) {

    }

    @Override
    public void isAttackedByArcherUnit(ArcherUnit archerUnit) {

    }

    @Override
    public void isAttackedByMonk(Monk monk) {

    }

    @Override
    public void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit) {

    }

    @Override
    public void isAttackedBySiegeUnit(SiegeUnit siegeUnit) {

    }

    @Override
    public void isAttackedByVillager(Villager villager) {

    }

    @Override
    public void isAttackedByCastle(Castle castle) {

    }
}
