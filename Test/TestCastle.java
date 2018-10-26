import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCastle {
    private ArcherUnit archerUnit;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;
    private Castle castle2;

    @Before
    public void setUp(){
        archerUnit=new ArcherUnit();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();
        castle2=new Castle();

    }

    @Test
    public void testBasic(){
        Assert.assertEquals(200,castle.getHitPoints(),0.1);
        Assert.assertEquals(23,castle.getAttackPoints(),0.1);
        Assert.assertTrue(castle.isAlive());
    }

    @Test
    public void testArcher(){
        archerUnit.attack(castle);
        Assert.assertEquals(198.8,castle.getHitPoints(),0.1);
        archerUnit.attack(castle);
        Assert.assertEquals(197.6,castle.getHitPoints(),0.1);
        archerUnit.attack(castle);
        Assert.assertEquals(196.4,castle.getHitPoints(),0.1);

    }

    @Test
    public void testCalvary(){
        calvaryUnit.attack(castle);
        Assert.assertEquals(195.5,castle.getHitPoints(),0.1);
        calvaryUnit.attack(castle);
        Assert.assertEquals(191,castle.getHitPoints(),0.1);
        calvaryUnit.attack(castle);
        Assert.assertEquals(186.5,castle.getHitPoints(),0.1);
    }

    @Test
    public void testCastle(){
        castle2.attack(castle);
        Assert.assertEquals(197.7,castle.getHitPoints(),0.1);
        castle2.attack(castle);
        Assert.assertEquals(195.4,castle.getHitPoints(),0.1);
        castle2.attack(castle);
        Assert.assertEquals(193.1,castle.getHitPoints(),0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(castle);
        Assert.assertEquals(196.4,castle.getHitPoints(),0.1);
        infantryUnit.attack(castle);
        infantryUnit.attack(castle);
        Assert.assertEquals(189.2,castle.getHitPoints(),0.1);
    }

    @Test
    public void testMonk(){
        monk.attack(castle);
        Assert.assertEquals(200,castle.getHitPoints(),0.1);

        monk.attack(castle);
        monk.attack(castle);
        monk.attack(castle);
        Assert.assertEquals(200,castle.getHitPoints(),0.1);
    }

    @Test
    public void testSiegeUnit(){
        siegeUnit.attack(castle);
        Assert.assertEquals(170,castle.getHitPoints(),0.1);
        siegeUnit.attack(castle);
        siegeUnit.attack(castle);
        siegeUnit.attack(castle);
        Assert.assertEquals(80,castle.getHitPoints(),0.1);
        siegeUnit.attack(castle);
        Assert.assertEquals(50,castle.getHitPoints(),0.1);
        siegeUnit.attack(castle);
        Assert.assertEquals(20,castle.getHitPoints(),0.1);
        siegeUnit.attack(castle);
        Assert.assertEquals(0,castle.getHitPoints(),0.1);
        Assert.assertFalse(castle.isAlive());
        castle.attack(siegeUnit);
        Assert.assertEquals(30,siegeUnit.getHitPoints(),0.1);
    }

    @Test
    public void testVillager(){
        villager.attack(castle);
        Assert.assertEquals(200,castle.getHitPoints(),0.1);
        siegeUnit.attack(castle);
        Assert.assertEquals(170,castle.getHitPoints(),0.1);
        villager.attack(castle);
        Assert.assertEquals(172.1,castle.getHitPoints(),0.1);
        villager.attack(castle);
        Assert.assertEquals(174.2,castle.getHitPoints(),0.1);
        villager.attack(castle);
        Assert.assertEquals(176.3,castle.getHitPoints(),0.1);
    }

}
