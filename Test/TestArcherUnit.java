import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArcherUnit {

    private ArcherUnit archerUnit1;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;

    @Before
    public void setUp(){
        archerUnit1=new ArcherUnit();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();

    }

    @Test
    public void testBasico(){
        double hp=30;
        double ap=12;
        Assert.assertEquals(hp,archerUnit1.getHitPoints(),0.1);
        Assert.assertEquals(ap,archerUnit1.getAttackPoints(),0.1);
        Assert.assertTrue(archerUnit1.isAlive());
    }

    @Test
    public void testArcher(){
        archerUnit1.attack(archerUnit1);
        double hp=archerUnit1.getHitPoints();
        Assert.assertEquals(15.6,hp,0.1);
        archerUnit1.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(1.2,hp,0.1);
        Assert.assertTrue(archerUnit1.isAlive());
        archerUnit1.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(archerUnit1.isAlive());
        archerUnit1.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(archerUnit1.isAlive());
    }

    @Test
    public void testCalvary(){
        calvaryUnit.attack(archerUnit1);
        double hp=archerUnit1.getHitPoints();
        Assert.assertTrue(archerUnit1.isAlive());
        Assert.assertEquals(7.5,hp,0.1);
        calvaryUnit.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(archerUnit1.isAlive());
        archerUnit1.attack(calvaryUnit);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(30,hp,0.1);
    }

    @Test
    public void testCastle(){
        castle.attack(archerUnit1);
        double hp=archerUnit1.getHitPoints();
        Assert.assertEquals(2.4,hp,0.1);
        castle.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(archerUnit1);
        double hp=archerUnit1.getHitPoints();
        Assert.assertEquals(15.6,hp,0.1);
        infantryUnit.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(1.2,hp,0.1);
        infantryUnit.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
    }

    @Test
    public void testMonk(){
        monk.attack(archerUnit1);
        double hp=archerUnit1.getHitPoints();
        Assert.assertEquals(35,hp,0.1);
        monk.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(40,hp,0.1);
        monk.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(45,hp,0.1);
        monk.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(50,hp,0.1);
        monk.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(55,hp,0.1);
        monk.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(60,hp,0.1);
        monk.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(60,hp,0.1);
    }

    @Test
    public void testSiege(){
        siegeUnit.attack(archerUnit1);
        double hp=archerUnit1.getHitPoints();
        Assert.assertEquals(7.5,hp,0.1);
        siegeUnit.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(0,hp,0.1);

    }

    @Test
    public void testVillager(){
        villager.attack(archerUnit1);
        double hp=archerUnit1.getHitPoints();
        Assert.assertEquals(23,hp,0.1);
        villager.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(16,hp,0.1);
        villager.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(9,hp,0.1);
        villager.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(2,hp,0.1);
        villager.attack(archerUnit1);
        hp=archerUnit1.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
    }

}
