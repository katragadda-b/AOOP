class SugarAddition implements Coffee 
{
    private Coffee coffee;

    public SugarAddition(Coffee coffee) 
    {
        this.coffee = coffee;
    }

    
    public int cost() 
    {
        return coffee.cost() + 1;  
    }

    
    public String description() 
    {
        return coffee.description() + ", Sugar";
    }
}