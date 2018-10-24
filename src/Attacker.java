/**
 * This interface represents the workings of the Attacker Objects, which can attack and be attacked.
 *
 * @author Valentina Sepulveda
 * @version 1.0
 */
public interface Attacker extends GameElements {

    int getAttackPoints();

    public void attack(GameElements gameElements);
}
