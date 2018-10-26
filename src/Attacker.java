/**
 * This interface represents the workings of the Attacker Objects, which can attack and be attacked.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public interface Attacker extends GameElements {

    /**
     * Returns the attackPoints of the entity that called it.
     * @return attackPoints
     */
    public double getAttackPoints();

    /**
     * This method represents the attack between the entity that calls the method and the one that is attacked.
     * @param gameElements element that is attacked
     */
    public void attack(GameElements gameElements);

}
