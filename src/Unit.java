/**
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public abstract class Unit implements Attacker {

    /**
     * Returns the attackPoints of the entity that called it.
     * @return attackPoints
     */
    public abstract double getAttackPoints();

    /**
     * This method represents the attack between the entity that calls the method and the one that is attacked.
     * @param gameElements element that is attacked
     */
    public abstract void attack(GameElements gameElements);
}
