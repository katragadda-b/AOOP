public class EasyLevelFactory implements GameElementFactory
{
    public Enemy createEnemy()
    {
        System.out.println(" enemy created. Level: easy");
        return new GoblinEnemy();
    }


    public Weapon createWeapon()
    {
        System.out.println("weapon obtained");
        return new Dagger();
    }

    public PowerUp createPowerUp()
    {
        System.out.println("you gained a power up");
        return new Health();
    }

    
}
