import java.util.Scanner;

public class CoffeeShop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your coffee: 1. Latte  2. Americano  3. Cappuccino");
        int choice = scanner.nextInt();
        Coffee coffee = null;

        switch (choice) 
        {
            case 1:
                coffee = new Latte();
                break;
            case 2:
                coffee = new Americano();
                break;
            case 3:
                coffee = new Cappuccino();
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.println("Enter number of coffee shots:");
        int coffeeShots = scanner.nextInt();

        for (int i = 1; i < coffeeShots; i++) 
        {
            if (coffee instanceof Latte) 
            {
                coffee = new Latte();
            } 
            else if (coffee instanceof Americano) 
            {
                coffee = new Americano();
            } 
            else if (coffee instanceof Cappuccino) 
            {
                coffee = new Cappuccino();
            }
        }

        System.out.println("How many shots of milk?");
        int milkShots = scanner.nextInt();
        for (int i = 0; i < milkShots; i++) {
            coffee = new MilkAddition(coffee);
        }

        System.out.println("How many shots of sugar?");
        int sugarShots = scanner.nextInt();
        for (int i = 0; i < sugarShots; i++) {
            coffee = new SugarAddition(coffee);
        }

        System.out.println("Your order: " + coffee.description());
        System.out.println("Total cost: $" + coffee.cost());
        scanner.close();
    }
}
