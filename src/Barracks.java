/**
 * This class represents the Barracks, of the Building type.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public class Barracks extends Building implements Attackable {
    private double hitPoints;

    public Barracks(){
        hitPoints=100;
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
     *  Returns the hitPoints of the instance of Barracks that called it.
     * @return hitPoints
     */
    @Override
    public double getHitPoints() {
        if(hitPoints<0){
            hitPoints=0;
        }
        if(hitPoints>100){
            hitPoints=100;
        }
        return hitPoints;
    }

    /**
     * Represents the action of the Barrack being attacked by an InfantryUnit, reducing the hitPoints of the
     * Barrack.
     * @param infantryUnit that attacked the Barrack
     */
    @Override
    public void isAttackedByInfantryUnit(InfantryUnit infantryUnit) {
        hitPoints=hitPoints-infantryUnit.getAttackPoints()*0.7;
    }

    /**
     * Represents the action of the Barrack being attacked by an ArcherUnit, reducing the hitPoints of the Barrack.
     * @param archerUnit that attacked the Barrack
     */
    @Override
    public void isAttackedByArcherUnit(ArcherUnit archerUnit) {
        hitPoints=hitPoints-archerUnit.getAttackPoints()*0.7;
    }

    /**
     * Represents the action of the Barrack being attacked by a Monk.
     * @param monk that "attacked" the Barrack.
     */
    @Override
    public void isAttackedByMonk(Monk monk) {

    }

    /**
     * Represents the action of the Barracks being attacked by a CalvaryUnit, reducing the hitPoints of the Barracks.
     * @param calvaryUnit that attacked the Barracks.
     */
    @Override
    public void isAttackedByCalvaryUnit(CalvaryUnit calvaryUnit) {
        hitPoints=hitPoints-calvaryUnit.getAttackPoints()*0.7;
    }

    /**
     * Represents the action of the Barracks being attacked by a SiegeUnit, reducing the hitPoints of the Barrack.
     * @param siegeUnit that attacked the Barracks.
     */
    @Override
    public void isAttackedBySiegeUnit(SiegeUnit siegeUnit) {
        hitPoints=hitPoints-siegeUnit.getAttackPoints()*2.0;
    }

    /**
     * Represents the action of the Barracks being repaired by a Villager, increasing the hitPoints of the Barracks.
     * @param villager that "attacked" the Barracks.
     */
    @Override
    public void isAttackedByVillager(Villager villager) {
        hitPoints=hitPoints+villager.getAttackPoints()*0.7;
    }

    /**
     * Represents the action of the Barracks being attacked by a Castle, reducing the hitPoints of the Barracks.
     * @param castle that attacked the Barracks
     */
    @Override
    public void isAttackedByCastle(Castle castle) {
        hitPoints=hitPoints-castle.getAttackPoints()*0.7;
    }
}
