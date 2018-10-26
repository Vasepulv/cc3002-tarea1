import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInfantryUnit {
    private ArcherUnit archerUnit;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;
    private InfantryUnit infantryUnit2;

    @Before
    public void setUp(){
        archerUnit=new ArcherUnit();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();
        infantryUnit2=new InfantryUnit();

    }

    @Test
    public void basicTest(){
        Assert.assertEquals(30,infantryUnit.getHitPoints(),0.1);
        Assert.assertEquals(12,infantryUnit.getAttackPoints(),0.1);
        Assert.assertTrue(infantryUnit.isAlive());
    }

    @Test
    public void testArcher(){
        archerUnit.attack(infantryUnit);
        Assert.assertEquals(15.6,infantryUnit.getHitPoints(),0.1);
        archerUnit.attack(infantryUnit);
        Assert.assertEquals(1.2,infantryUnit.getHitPoints(),0.1);
        archerUnit.attack(infantryUnit);
        Assert.assertEquals(0,infantryUnit.getHitPoints(),0.1);
        Assert.assertFalse(infantryUnit.isAlive());
        archerUnit.attack(infantryUnit);
        Assert.assertEquals(0,infantryUnit.getHitPoints(),0.1);
        Assert.assertFalse(infantryUnit.isAlive());
    }

    @Test
    public void testCalvary(){
        calvaryUnit.attack(infantryUnit);
        Assert.assertEquals(15,infantryUnit.getHitPoints(),0.1);
        calvaryUnit.attack(infantryUnit);
        Assert.assertEquals(0,infantryUnit.getHitPoints(),0.1);
        calvaryUnit.attack(infantryUnit);
        Assert.assertEquals(0,infantryUnit.getHitPoints(),0.1);
        infantryUnit.attack(calvaryUnit);
        Assert.assertEquals(30,calvaryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testCastle(){
        castle.attack(infantryUnit);
        Assert.assertEquals(2.4,infantryUnit.getHitPoints(),0.1);
        castle.attack(infantryUnit);
        castle.attack(infantryUnit);
        Assert.assertEquals(0,infantryUnit.getHitPoints(),0.1);
        infantryUnit.attack(castle);
        Assert.assertEquals(200,castle.getHitPoints(),0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(infantryUnit2);
        Assert.assertEquals(18,infantryUnit2.getHitPoints(),0.1);
        infantryUnit.attack(infantryUnit2);
        Assert.assertEquals(6,infantryUnit2.getHitPoints(),0.1);
        infantryUnit.attack(infantryUnit2);
        infantryUnit.attack(infantryUnit2);
        Assert.assertEquals(0,infantryUnit2.getHitPoints(),0.1);
        infantryUnit2.attack(infantryUnit);
        Assert.assertEquals(30,infantryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testMonk(){
        monk.attack(infantryUnit);
        monk.attack(infantryUnit);
        Assert.assertEquals(40,infantryUnit.getHitPoints(),0.1);

        monk.attack(infantryUnit);
        monk.attack(infantryUnit);
        Assert.assertEquals(50,infantryUnit.getHitPoints(),0.1);

        monk.attack(infantryUnit);
        monk.attack(infantryUnit);
        Assert.assertEquals(60,infantryUnit.getHitPoints(),0.1);

        monk.attack(infantryUnit);
        Assert.assertEquals(60,infantryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testSiegeUnit(){
        siegeUnit.attack(infantryUnit);
        Assert.assertEquals(7.5,infantryUnit.getHitPoints(),0.1);
        siegeUnit.attack(infantryUnit);
        Assert.assertEquals(0,infantryUnit.getHitPoints(),0.1);
        Assert.assertFalse(infantryUnit.isAlive());
    }

    @Test
    public void testVillager(){
        villager.attack(infantryUnit);
        Assert.assertEquals(24.4,infantryUnit.getHitPoints(),0.1);
        villager.attack(infantryUnit);
        Assert.assertEquals(18.8,infantryUnit.getHitPoints(),0.1);
        villager.attack(infantryUnit);
        Assert.assertEquals(13.2,infantryUnit.getHitPoints(),0.1);
        villager.attack(infantryUnit);
        villager.attack(infantryUnit);
        Assert.assertEquals(2,infantryUnit.getHitPoints(),0.1);
        villager.attack(infantryUnit);
        Assert.assertEquals(0,infantryUnit.getHitPoints(),0.1);

    }
}
