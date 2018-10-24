/**
 * This class represents the SiegeUnit, of the Unit type.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public class SiegeUnit extends Unit {
    private int hitPoints;
    private int attackPoints;

    public SiegeUnit(){

    }

    @Override
    public void attack(GameElements gameElements) {
        gameElements.isAttackedBySiegeUnit(this);
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public int getAttackPoints() {
        return attackPoints;
    }

    @Override
    public boolean isAlive() {
        return false;
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
