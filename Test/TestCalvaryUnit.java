import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalvaryUnit {

    private ArcherUnit archerUnit;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;
    private CalvaryUnit calvaryUnit2;

    @Before
    public void setUp(){
        archerUnit=new ArcherUnit();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();
        calvaryUnit2=new CalvaryUnit();

    }

    @Test
    public void basicTest(){
        double hp=30;
        double at=15;
        Assert.assertEquals(hp,calvaryUnit.getHitPoints(),0.1);
        Assert.assertEquals(at,calvaryUnit.getAttackPoints(),0.1);
        Assert.assertTrue(calvaryUnit.isAlive());

    }

    @Test
    public void testArcher(){
        archerUnit.attack(calvaryUnit);
        double hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(18,hp,0.1);
        archerUnit.attack(calvaryUnit);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(6,hp,0.1);
        archerUnit.attack(calvaryUnit);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(calvaryUnit.isAlive());
    }

    @Test
    public void testCalvary(){
        calvaryUnit2.attack(calvaryUnit);
        double hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(15,hp,0.1);
        Assert.assertEquals(30,calvaryUnit2.getHitPoints(),0.1);
        calvaryUnit.attack(calvaryUnit2);
        hp=calvaryUnit2.getHitPoints();
        Assert.assertEquals(15,hp,0.1);
        calvaryUnit2.attack(calvaryUnit);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertTrue(calvaryUnit2.isAlive());
        Assert.assertFalse(calvaryUnit.isAlive());
        calvaryUnit.attack(calvaryUnit2);
        Assert.assertEquals(15,calvaryUnit2.getHitPoints(),0.1);
        Assert.assertEquals(0,calvaryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testCastle(){
        castle.attack(calvaryUnit);
        double hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(2.4,hp,0.1);
        castle.attack(calvaryUnit);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(calvaryUnit.isAlive());
        castle.attack(calvaryUnit);
        hp=castle.getHitPoints();
        Assert.assertEquals(200,hp,0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(calvaryUnit);
        double hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(15.6,hp,0.1);
        infantryUnit.attack(calvaryUnit);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(1.2,hp,0.1);
        infantryUnit.attack(calvaryUnit);
        hp=calvaryUnit.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(calvaryUnit.isAlive());

    }

    @Test
    public void testMonk(){
        monk.attack(calvaryUnit);
        Assert.assertEquals(35,calvaryUnit.getHitPoints(),0.1);
        monk.attack(calvaryUnit);
        Assert.assertEquals(40,calvaryUnit.getHitPoints(),0.1);
        monk.attack(calvaryUnit);
        Assert.assertEquals(45,calvaryUnit.getHitPoints(),0.1);
        monk.attack(calvaryUnit);
        Assert.assertEquals(50,calvaryUnit.getHitPoints(),0.1);
        monk.attack(calvaryUnit);
        Assert.assertEquals(55,calvaryUnit.getHitPoints(),0.1);
        monk.attack(calvaryUnit);
        Assert.assertEquals(60,calvaryUnit.getHitPoints(),0.1);
        monk.attack(calvaryUnit);
        Assert.assertEquals(60,calvaryUnit.getHitPoints(),0.1);

    }

    @Test
    public void testSiege(){
        siegeUnit.attack(calvaryUnit);
        Assert.assertEquals(15,calvaryUnit.getHitPoints(),0.1);
        siegeUnit.attack(calvaryUnit);
        Assert.assertEquals(0,calvaryUnit.getHitPoints(),0.1);
        siegeUnit.attack(calvaryUnit);
        Assert.assertEquals(0,calvaryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testVillager(){
        villager.attack(calvaryUnit);
        Assert.assertEquals(26.5,calvaryUnit.getHitPoints(),0.1);
        villager.attack(calvaryUnit);
        Assert.assertEquals(23,calvaryUnit.getHitPoints(),0.1);
        villager.attack(calvaryUnit);
        Assert.assertEquals(19.5,calvaryUnit.getHitPoints(),0.1);
        villager.attack(calvaryUnit);
        Assert.assertEquals(16,calvaryUnit.getHitPoints(),0.1);
    }
}
