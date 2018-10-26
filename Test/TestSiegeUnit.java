import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSiegeUnit {

    private ArcherUnit archerUnit;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;
    private SiegeUnit siegeUnit2;

    @Before
    public void setUp(){
        archerUnit=new ArcherUnit();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();
        siegeUnit2=new SiegeUnit();

    }

    @Test
    public void testBasic(){
        Assert.assertEquals(30,siegeUnit.getHitPoints(),0.1);
        Assert.assertEquals(15,siegeUnit.getAttackPoints(),0.1);
        Assert.assertTrue(siegeUnit.isAlive());
    }

    @Test
    public void testArcher(){
        archerUnit.attack(siegeUnit);
        Assert.assertEquals(20.4,siegeUnit.getHitPoints(),0.1);
        archerUnit.attack(siegeUnit);
        Assert.assertEquals(10.8,siegeUnit.getHitPoints(),0.1);
        archerUnit.attack(siegeUnit);
        Assert.assertEquals(1.2,siegeUnit.getHitPoints(),0.1);
        archerUnit.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
        archerUnit.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
        siegeUnit.attack(archerUnit);
        Assert.assertEquals(30,archerUnit.getHitPoints(),0.1);
    }

    @Test
    public void testCalvary(){
        calvaryUnit.attack(siegeUnit);
        Assert.assertEquals(12,siegeUnit.getHitPoints(),0.1);
        calvaryUnit.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
        siegeUnit.attack(calvaryUnit);
        Assert.assertEquals(30,calvaryUnit.getHitPoints(),0.1);
        calvaryUnit.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
    }

    @Test
    public void testCastle(){
        castle.attack(siegeUnit);
        Assert.assertEquals(18.5,siegeUnit.getHitPoints(),0.1);
        castle.attack(siegeUnit);
        Assert.assertEquals(7,siegeUnit.getHitPoints(),0.1);
        castle.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(siegeUnit);
        Assert.assertEquals(15.6,siegeUnit.getHitPoints(),0.1);
        infantryUnit.attack(siegeUnit);
        Assert.assertEquals(1.2,siegeUnit.getHitPoints(),0.1);
        infantryUnit.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
        siegeUnit.attack(infantryUnit);
        Assert.assertEquals(30,infantryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testMonk(){
        monk.attack(siegeUnit);
        monk.attack(siegeUnit);
        monk.attack(siegeUnit);
        Assert.assertEquals(30,siegeUnit.getHitPoints(),0.1);

        monk.attack(siegeUnit);
        monk.attack(siegeUnit);
        monk.attack(siegeUnit);
        Assert.assertEquals(30,siegeUnit.getHitPoints(),0.1);
    }

    @Test
    public void testSiege(){
        siegeUnit2.attack(siegeUnit);
        Assert.assertEquals(7.5,siegeUnit.getHitPoints(),0.1);
        siegeUnit2.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
        monk.attack(siegeUnit);
        Assert.assertEquals(0,siegeUnit.getHitPoints(),0.1);
        Assert.assertFalse(siegeUnit.isAlive());
    }

    @Test
    public void testVillager(){
        villager.attack(siegeUnit);
        Assert.assertEquals(33.5,siegeUnit.getHitPoints(),0.1);
        villager.attack(siegeUnit);
        Assert.assertEquals(37,siegeUnit.getHitPoints(),0.1);
        villager.attack(siegeUnit);
        villager.attack(siegeUnit);
        Assert.assertEquals(44,siegeUnit.getHitPoints(),0.1);
        villager.attack(siegeUnit);
        villager.attack(siegeUnit);
        Assert.assertEquals(51,siegeUnit.getHitPoints(),0.1);
        villager.attack(siegeUnit);
        villager.attack(siegeUnit);
        Assert.assertEquals(58,siegeUnit.getHitPoints(),0.1);
        villager.attack(siegeUnit);
        Assert.assertEquals(60,siegeUnit.getHitPoints(),0.1);
    }
}
