/**
 * This class represents the SiegeUnit, of the Unit type.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public class SiegeUnit extends Unit {
    private double hitPoints;
    private double attackPoints;

    public SiegeUnit(){
        hitPoints=30;
        attackPoints=15;
    }

    /**
     * This method represents the attack between the entity that calls the method and the one that is attacked.
     * @param gameElements element that is attacked
     */
    @Override
    public void attack(GameElements gameElements) {
        if(isAlive()){
            gameElements.isAttackedBySiegeUnit(this);
        }
    }

    /**
     *  Returns the hitPoints of the instance of SiegeUnit that called it.
     * @return hitPoints
     */
    @Override
    public double getHitPoints() {
        if(hitPoints<0){
            hitPoints=0;
        }
        if(hitPoints>60){
            hitPoints=60;
        }
        return hitPoints;
    }

    /**
     * Returns the attackPoints of the instance of SiegeUnit that called it.
     * @return attackPoints
     */
    @Override
    public double getAttackPoints() {
        return attackPoints;
    }

    /**
     * Returns true if the entity that called it has positive hitPoints, false if not.
     * @return whether the entity is alive
     */
    @Override
    public boolean isAlive() {
        return !(hitPoints==0);
    }

    /**
     * Represents the action of the SiegeUnit being attacked by an InfantryUnit, reducing the hitPoints of the
     * SiegeUnit.
     * @param infantryUnit that attacked the SiegeUnit.
     */
    @Override
    public void isAttackedByInfantryUnit(InfantryUnit infantryUnit) {
        hitPoints=hitPoints-infantryUnit.getAttackPoints()*1.2;
    }

    /**
     * Represents the action of the SiegeUnit being attacked by an ArcherUnit, reducing the hitPoints of the SiegeUnit.
     * @param archerUnit that attacked the SiegeUnit.
     */
    @Override
    public void isAttackedByArcherUnit(ArcherUnit archerUnit) {
        hitPoints=hitPoints-archerUnit.getAttackPoints()*0.8;
    }

    /**
     * Represents the action of the SiegeUnit being attacked by a Monk.
     * @param monk that "attacked" the SiegeUnit.
     */
    @Override
    public void isAttackedByMonk(Monk monk) {

    }

    /**
     * Represents the action of the SiegeUnit being attacked by a CalvaryUnit, reducing the hitPoints of the SiegeUnit.
     * @param calvaryUnit that attacked the SiegeUnit
     */
    @Override
    public void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit) {
        hitPoints=hitPoints-calvaryUnit.getAttackPoints()*1.2;
    }

    /**
     * Represents the action of the SiegeUnit being attacked by a SiegeUnit reducing the hitPoints of the SiegeUnit
     * that was attacked.
     * @param siegeUnit that attacked the SiegeUnit
     */
    @Override
    public void isAttackedBySiegeUnit(SiegeUnit siegeUnit) {
        hitPoints=hitPoints-siegeUnit.getAttackPoints()*1.5;
    }

    /**
     * Represents the action of the SiegeUnit being attacked by a Villager, reducing the hitPoints of the SiegeUnit.
     * @param villager that attacked the SiegeUnit
     */
    @Override
    public void isAttackedByVillager(Villager villager) {
        hitPoints=hitPoints+villager.getAttackPoints()*0.5;
    }

    /**
     * Represents the action of the SiegeUnit being attacked by a Castle, reducing the hitPoints of the SiegeUnit.
     * @param castle that attacked the SiegeUnit
     */
    @Override
    public void isAttackedByCastle(Castle castle) {
        hitPoints=hitPoints-castle.getAttackPoints()*0.5;
    }
}
