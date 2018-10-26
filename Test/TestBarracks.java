import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBarracks {

    private ArcherUnit archerUnit;
    private Barracks barracks;
    private CalvaryUnit calvaryUnit;
    private Castle castle;
    private InfantryUnit infantryUnit;
    private Monk monk;
    private SiegeUnit siegeUnit;
    private Villager villager;


    @Before
    public void setUp(){
        archerUnit=new ArcherUnit();
        barracks=new Barracks();
        calvaryUnit=new CalvaryUnit();
        castle=new Castle();
        infantryUnit=new InfantryUnit();
        monk=new Monk();
        siegeUnit=new SiegeUnit();
        villager=new Villager();
    }

    @Test
    public void basicTest(){
        double hp=100;
        Assert.assertEquals(hp,barracks.getHitPoints(),0.1);
        Assert.assertTrue(barracks.isAlive());
    }


    @Test
    public void testArcher(){
        archerUnit.attack(barracks);
        double hp=barracks.getHitPoints();
        Assert.assertEquals(91.6,hp,0.1);
        Assert.assertTrue(barracks.isAlive());
        archerUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(83.2,hp,0.1);
        archerUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(74.8,hp,0.1);
    }

    @Test
    public void testCalvary(){
        calvaryUnit.attack(barracks);
        double hp=barracks.getHitPoints();
        Assert.assertEquals(89.5,hp,0.1);
        calvaryUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(79,hp,0.1);
        calvaryUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(68.5,hp,0.1);
    }

    @Test
    public void testCastle(){
        castle.attack(barracks);
        double hp=barracks.getHitPoints();
        Assert.assertEquals(83.9,hp,0.1);
        castle.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(67.8,hp,0.1);
        castle.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(51.7,hp,0.1);
        castle.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(35.6,hp,0.1);
    }

    @Test
    public void testInfantry(){
        infantryUnit.attack(barracks);
        double hp=barracks.getHitPoints();
        Assert.assertEquals(91.6,hp,0.1);
        infantryUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(83.2,hp,0.1);
        infantryUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(74.8,hp,0.1);
    }

    @Test
    public void testMonk(){
        monk.attack(barracks);
        double hp=barracks.getHitPoints();
        Assert.assertEquals(100,hp,0.1);
        monk.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(100,hp,0.1);
        monk.attack(barracks);
        monk.attack(barracks);
        monk.attack(barracks);
        monk.attack(barracks);
        monk.attack(barracks);
        Assert.assertEquals(100,hp,0.1);
    }

    @Test
    public void testSiege(){
        siegeUnit.attack(barracks);
        double hp=barracks.getHitPoints();
        Assert.assertEquals(70,hp,0.1);
        siegeUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(40,hp,0.1);
        siegeUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(10,hp,0.1);
        Assert.assertTrue(barracks.isAlive());
        siegeUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(barracks.isAlive());
        siegeUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(0,hp,0.1);
        Assert.assertFalse(barracks.isAlive());

    }

    @Test
    public void testVillager(){
        double hp=barracks.getHitPoints();
        Assert.assertEquals(100,hp,0.1);
        villager.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(100,hp,0.1);
        siegeUnit.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(70,hp,0.1);
        villager.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(74.9,hp,0.1);
        villager.attack(barracks);
        hp=barracks.getHitPoints();
        Assert.assertEquals(79.8,hp,0.1);
    }
}
