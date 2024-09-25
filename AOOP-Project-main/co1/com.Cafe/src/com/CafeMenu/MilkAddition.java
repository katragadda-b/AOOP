class MilkAddition implements Coffee 
{
    private Coffee coffee;

    public MilkAddition(Coffee coffee) 
    {
        this.coffee = coffee;
    }

    public int cost() 
    {
        return coffee.cost() + 1;  
    }

    public String description() 
    {
        return coffee.description() + ", Milk";
    }
}