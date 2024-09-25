public class HardLevelFactory implements GameElementFactory {
    public Enemy createEnemy()
    {
        System.out.println(" enemy created. Level: easy");
        return new Shrek();
    }


    public Weapon createWeapon()
    {
        System.out.println("weapon obtained");
        return new Sword();
    }

    public PowerUp createPowerUp()
    {
        System.out.println("you gained a power up");
        return new Health();
    }

    
}
