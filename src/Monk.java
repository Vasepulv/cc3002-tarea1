/**
 * This class represents the Monk Unit, of the Unit type.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public class Monk extends Unit {
    private double hitPoints;
    private double attackPoints;

    public Monk(){
        hitPoints=20;
        attackPoints=10;
    }

    /**
     * This method represents the attack between the entity that calls the method and the one that is attacked.
     * @param gameElements element that is attacked
     */
    @Override
    public void attack(GameElements gameElements) {
        if(gameElements.isAlive() && this.isAlive()){
            gameElements.isAttackedByMonk(this);
        }
    }

    /**
     *  Returns the hitPoints of the instance of Monk that called it.
     * @return hitPoints
     */
    @Override
    public double getHitPoints() {
        if(hitPoints>40){
            hitPoints=40;
        }
        return hitPoints;
    }

    /**
     * Returns the attackPoints of the instance of Monk that called it.
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
     * Represents the action of the Monk being attacked by an InfantryUnit, reducing the hitPoints of the
     * Monk.
     * @param infantryUnit that attacked the Monk
     */
    @Override
    public void isAttackedByInfantryUnit(InfantryUnit infantryUnit) {
        hitPoints=0;
    }

    /**
     * Represents the action of the Monk being attacked by an ArcherUnit, reducing the hitPoints of the Monk.
     * @param archerUnit that attacked the Monk.
     */
    @Override
    public void isAttackedByArcherUnit(ArcherUnit archerUnit) {
        hitPoints=0;
    }

    /**
     * Represents the action of the Monk being attacked by a Monk, increasing the hitPoints of the Monk
     * that was attacked.
     * @param monk that "attacked" the Monk
     */
    @Override
    public void isAttackedByMonk(Monk monk) {
        hitPoints=hitPoints+monk.getAttackPoints()*0.5;
    }

    /**
     * Represents the action of the Monk being attacked by a CalvaryUnit, reducing the hitPoints of the Monk.
     * @param calvaryUnit that attacked the Monk.
     */
    @Override
    public void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit) {
        hitPoints=0;
    }

    /**
     * Represents the action of the Monk being attacked by a SiegeUnit, reducing the hitPoints of the Monk.
     * @param siegeUnit that attacked the Monk.
     */
    @Override
    public void isAttackedBySiegeUnit(SiegeUnit siegeUnit) {
        hitPoints=0;
    }

    /**
     * Represents the action of the Monk being attacked by a Villager.
     * @param villager that attacked the Monk
     */
    @Override
    public void isAttackedByVillager(Villager villager) {

    }

    /**
     * Represents the action of the Monk being attacked by a Castle, reducing the hitPoints of the Monk.
     * @param castle that attacked the Monk
     */
    @Override
    public void isAttackedByCastle(Castle castle) {
        hitPoints=0;
    }
}
