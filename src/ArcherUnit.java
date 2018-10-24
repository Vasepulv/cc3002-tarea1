/**
 * This class represents the ArcherUnit, of the Unit type.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public class ArcherUnit extends Unit {
    private int hitPoints;
    private int attackPoints;

    public ArcherUnit(){

    }

    @Override
    public void attack(GameElements gameElements) {
        gameElements.isAttackedByArcherUnit(this);
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
