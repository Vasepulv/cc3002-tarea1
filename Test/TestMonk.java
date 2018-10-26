import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMonk {

    private ArcherUnit archerUnit;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;
    private Monk monk2;

    @Before
    public void setUp(){
        archerUnit=new ArcherUnit();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();
        monk2=new Monk();
    }

    @Test
    public void basicTest(){
        Assert.assertEquals(20,monk.getHitPoints(),0.1);
        Assert.assertEquals(10,monk.getAttackPoints(),0.1);
        Assert.assertTrue(monk.isAlive());
    }

    @Test
    public void testArcher(){
        archerUnit.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
        Assert.assertFalse(monk.isAlive());
        monk.attack(archerUnit);
        Assert.assertEquals(30,archerUnit.getHitPoints(),0.1);
    }

    @Test
    public void testCalvaryUnit(){
        calvaryUnit.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
        Assert.assertFalse(monk.isAlive());
        monk.attack(calvaryUnit);
        Assert.assertEquals(30,calvaryUnit.getHitPoints(),0.1);
        calvaryUnit.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
    }

    @Test
    public void testCastle(){
        castle.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
        castle.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
        monk.attack(castle);
        Assert.assertEquals(200,castle.getHitPoints(),0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
        infantryUnit.attack(monk);
        infantryUnit.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
        monk.attack(infantryUnit);
        Assert.assertEquals(30,infantryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testMonk(){
        monk2.attack(monk);
        Assert.assertEquals(25,monk.getHitPoints(),0.1);
        monk2.attack(monk);
        Assert.assertEquals(30,monk.getHitPoints(),0.1);
        monk2.attack(monk);
        Assert.assertEquals(35,monk.getHitPoints(),0.1);
        monk2.attack(monk);
        Assert.assertEquals(40,monk.getHitPoints(),0.1);
        monk2.attack(monk);
        Assert.assertEquals(40,monk.getHitPoints(),0.1);
        archerUnit.attack(monk);
        Assert.assertFalse(monk.isAlive());
        monk2.attack(monk);
        Assert.assertFalse(monk.isAlive());
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
    }

    @Test
    public void testSiege(){
        siegeUnit.attack(monk);
        Assert.assertEquals(0,monk.getHitPoints(),0.1);
        Assert.assertFalse(monk.isAlive());
        siegeUnit.attack(monk2);
        Assert.assertEquals(0,monk2.getHitPoints(),0.1);
        monk.attack(siegeUnit);
        Assert.assertEquals(30,siegeUnit.getHitPoints(),0.1);
    }

    @Test
    public void testVillager(){
        villager.attack(monk);
        Assert.assertTrue(monk.isAlive());
        Assert.assertEquals(20,monk.getHitPoints(),0.1);
        villager.attack(monk);
        Assert.assertEquals(20,monk.getHitPoints(),0.1);
    }

}
