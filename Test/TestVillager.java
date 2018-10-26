import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestVillager {
    private ArcherUnit archerUnit;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;
    private Villager villager2;

    @Before
    public void setUp(){
        archerUnit=new ArcherUnit();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();
        villager2=new Villager();

    }

    @Test
    public void basicTest(){
        Assert.assertEquals(30,villager.getHitPoints(),0.1);
        Assert.assertEquals(7,villager.getAttackPoints(),0.1);
        Assert.assertTrue(villager.isAlive());
    }

    @Test
    public void testArcher(){
        archerUnit.attack(villager);
        Assert.assertEquals(12,villager.getHitPoints(),0.1);
        archerUnit.attack(villager);
        Assert.assertEquals(0,villager.getHitPoints(),0.1);
        Assert.assertFalse(villager.isAlive());

    }

    @Test
    public void testCalvary(){
        calvaryUnit.attack(villager);
        Assert.assertEquals(7.5,villager.getHitPoints(),0.1);
        calvaryUnit.attack(villager);
        Assert.assertEquals(0,villager.getHitPoints(),0.1);
        villager.attack(calvaryUnit);
        Assert.assertEquals(30,calvaryUnit.getHitPoints(),0.1);
    }

    @Test
    public void testCastle(){
        castle.attack(villager);
        Assert.assertEquals(2.4,villager.getHitPoints(),0.1);
        castle.attack(villager);
        Assert.assertEquals(0,villager.getHitPoints(),0.1);
        castle.attack(villager);
        Assert.assertEquals(0,villager.getHitPoints(),0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(villager);
        Assert.assertEquals(12,villager.getHitPoints(),0.1);
        infantryUnit.attack(villager);
        Assert.assertEquals(0,villager.getHitPoints(),0.1);
    }

    @Test
    public void testMonk(){
        monk.attack(villager);
        monk.attack(villager);
        monk.attack(villager);
        Assert.assertEquals(45,villager.getHitPoints(),0.1);

        monk.attack(villager);
        monk.attack(villager);
        monk.attack(villager);
        Assert.assertEquals(60,villager.getHitPoints(),0.1);
        monk.attack(villager);
        Assert.assertEquals(60,villager.getHitPoints(),0.1);
        infantryUnit.attack(villager);
        Assert.assertEquals(42,villager.getHitPoints(),0.1);
        monk.attack(villager);
        Assert.assertEquals(47,villager.getHitPoints(),0.1);
    }

    @Test
    public void testVillager(){
        villager2.attack(villager);
        Assert.assertEquals(23,villager.getHitPoints(),0.1);
        villager2.attack(villager);
        villager2.attack(villager);
        Assert.assertEquals(9,villager.getHitPoints(),0.1);
        villager2.attack(villager);
        Assert.assertEquals(2,villager.getHitPoints(),0.1);

    }

    @Test
    public void testSiege(){
        siegeUnit.attack(villager);
        Assert.assertEquals(7.5,villager.getHitPoints(),0.1);
        siegeUnit.attack(villager);
        Assert.assertEquals(0,villager.getHitPoints(),0.1);
    }
}
