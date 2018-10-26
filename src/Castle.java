/**
 * This class represents the Castle, of the Building type.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public class Castle extends Building implements Attacker{

    private double hitPoints;
    private double attackPoints;

    public Castle(){
        hitPoints=200;
        attackPoints=23;
    }

    /**
     * This method represents the attack between the entity that calls the method and the one that is attacked.
     * @param gameElements element that is attacked
     */
    @Override
    public void attack(GameElements gameElements) {
        if(isAlive()){
            gameElements.isAttackedByCastle(this);
        }
    }

    /**
     *  Returns the hitPoints of the instance of Castle that called it.
     * @return hitPoints
     */
    @Override
    public double getHitPoints() {
        if(hitPoints<0){
            hitPoints=0;
        }
        if(hitPoints>200){
            hitPoints=200;
        }
        return hitPoints;
    }

    /**
     * Returns the attackPoints of the instance of Castle that called it.
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
     * Represents the action of the Castle being attacked by an InfantryUnit, reducing the hitPoints of the
     * Castle.
     * @param infantryUnit that attacked the Castle
     */
    @Override
    public void isAttackedByInfantryUnit(InfantryUnit infantryUnit) {
        hitPoints=hitPoints-infantryUnit.getAttackPoints()*0.3;
    }

    /**
     * Represents the action of the Castle being attacked by an ArcherUnit, reducing the hitPoints of the Castle.
     * @param archerUnit that attacked the Castle
     */
    @Override
    public void isAttackedByArcherUnit(ArcherUnit archerUnit) {
        hitPoints=hitPoints-archerUnit.getAttackPoints()*0.1;
    }

    /**
     * Represents the action of the Castle being attacked by a Monk.
     * @param monk that "attacked" the Castle.
     */
    @Override
    public void isAttackedByMonk(Monk monk) {

    }

    /**
     * Represents the action of the Castle being attacked by a CalvaryUnit, reducing the hitPoints of the Castle.
     * @param calvaryUnit that attacked the Castle
     */
    @Override
    public void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit) {
        hitPoints=hitPoints-calvaryUnit.getAttackPoints()*0.3;
    }

    /**
     * Represents the action of the Castle being attacked by a SiegeUnit, reducing the hitPoints of the Castle.
     * @param siegeUnit that attacked the Castle.
     */
    @Override
    public void isAttackedBySiegeUnit(SiegeUnit siegeUnit) {
        hitPoints=hitPoints-siegeUnit.getAttackPoints()*2.0;
    }

    /**
     * Represents the action of the Castle being repaired by a Villager, increasing the hitPoints of the Castle.
     * @param villager that "attacked" the Castle.
     */
    @Override
    public void isAttackedByVillager(Villager villager) {
        hitPoints=hitPoints+villager.getAttackPoints()*0.3;
    }

    /**
     * Represents the action of the Castle being attacked by a Castle, reducing the hitPoints of the Castle
     * that was attacked.
     * @param castle that attacked the Castle
     */
    @Override
    public void isAttackedByCastle(Castle castle) {
        hitPoints=hitPoints-castle.getAttackPoints()*0.1;
    }
}
