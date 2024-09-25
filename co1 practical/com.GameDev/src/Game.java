import java.util.*;

class Game
{
    private static Scanner read=new Scanner(System.in);
    private static Game player;
    private GameElementFactory factory;

    public static Game getPlayer()
    {
        if(player==null)
        {
            player=new Game();
        }
        return player;
    }

    public void setLevelFactory(GameElementFactory factory)
    {
        this.factory=factory;
    }

    public static void getStats(int health,int enemy)
    {
        System.out.println("health is "+health+"\nenemy health is"+enemy+"\n");
    }

    public void play()
    {
        int health=1000;
        System.out.println("choose difficulty\n1.Easy\n2.Hard\n");
        String difficulty=read.nextLine();


        Health addhealth=new Health();
        Shrek shrek=new Shrek();
        GoblinEnemy goblin=new GoblinEnemy();
        Dagger dagger=new Dagger();
        Sword sword=new Sword();


        difficulty=difficulty.toLowerCase();
        if(difficulty.equals("1")||difficulty.equals("easy"))
        {
            factory=new EasyLevelFactory();

            int enemy=500;

            while(health>0)
        {
            Random r=new Random();
            int move=r.nextInt(100)+1;

            if(0<=move&&move<=15)
            {
                health+=50;
                addhealth.activate();
                getStats(health, enemy);
                
            }
            else if (move>=16&&move<30)
            {
                health+=30;
                addhealth.activate();
                getStats(health, enemy);
            }
            else
            {
                if(move%2==0 && move<=80)
                {
                    System.out.println("\n\natacked by a goblin.");
                    goblin.attack();
                    health-=40;
                    getStats(health, enemy);
                }

                else if(move%2==1&&move<=80)
                {
                    System.out.println("\n\natacked by a bunch of goblins.");
                    goblin.attack();
                    health-=60;
                    getStats(health, enemy);
                }
                else
                {
                    System.out.println("you attacked a goblin");
                    dagger.use();
                    enemy-=100;
                    getStats(health, enemy);
                }
            }

            if(enemy<=0&health>0)
            {
                getStats(health, enemy);
                System.out.println("You win");
                break;
            }


            System.out.println("Continye(y/n)");
            String c=read.nextLine();
            if(c.equals("n"))
            {
                getStats(health, enemy);
               System.out.println("Game over"); 
               break;
            }
            else if(health<=0&&enemy>0)
            {
                getStats(health, enemy);
                System.out.println("Game Over");
            }
            
            
        }

        }
        else if(difficulty.equals("2")||difficulty.equals("hard"))
        {
            factory=new HardLevelFactory();
            int enemy=500;

            while(health>0)
        {
            Random r=new Random();
            int move=r.nextInt(100)+1;

            if(0<=move&&move<=15)
            {
                health+=50;
                addhealth.activate();
                getStats(health, enemy);
                
            }
            else if (move>=16&&move<30)
            {
                health+=30;
                addhealth.activate();
                getStats(health, enemy);
            }
            else
            {
                if(move%2==0 && move<=80)
                {
                    System.out.println("\n\natacked by a goblin.");
                    goblin.attack();
                    health-=40;
                    getStats(health, enemy);
                }

                else if(move%2==1&&move<=80)
                {
                    System.out.println("\n\natacked by shrek .");
                    shrek.attack();
                    health-=80;
                    getStats(health, enemy);
                }
                else
                {
                    System.out.println("you attacked an enemy");
                    sword.use();
                    enemy-=100;
                    getStats(health, enemy);
                }
            }
            if(enemy<=0&health>0)
            {
                getStats(health, enemy);
                System.out.println("You win");
                break;
            }
            else if(health<=0&&enemy>0)
            {
                getStats(health, enemy);
                System.out.println("Game Over");
            }

            
            System.out.println("Continye(y/n)");
            String c=read.nextLine();
            if(c.equals("n"))
            {
                getStats(health, enemy);
               System.out.println("Game over"); 
               break;
            }
            
        }

        }
        


    }

    public static void main(String[] args) {
        Game game=Game.getPlayer();
        game.play();
    }
}