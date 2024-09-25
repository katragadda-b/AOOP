import java.util.*;


public class BankingManagement
{
    private static BankingManagement user;
    private String AccountNumber;
    private String UserPin;

    private static Scanner read=new Scanner(System.in);
    
    private BankingManagement(String AccountNumber,String UserPin)
    {
        this.AccountNumber=AccountNumber;
        this.UserPin=UserPin;
    }

    public static BankingManagement getDetails(String AccountNumber,String UserPin)
    {
        if(user==null)
        {
            user=new BankingManagement(AccountNumber, UserPin);
        }
        return user;
    }

    public boolean login(String AccountNumber,String UserPin)
    {
        if(this.AccountNumber.equals(AccountNumber)&&this.UserPin.equals(UserPin))
        return true;
        return false;
    }

    public int withdraw(String UserPin, int total, boolean LoginStatus)
    {
        if(LoginStatus)
        {
            if(total==0)
            {
                System.out.println("insufficient balance.");
                
            }

            else
            {
                System.out.println("enter amount");
                int amount=read.nextInt();
                read.nextLine();
                System.out.println("enter pin");
                String pin=read.nextLine();
            
                if(this.UserPin.equals(pin)&&total>=amount)
                {
                    System.out.println(" amount withdrawed is "+amount);
                    total-=amount;
                    System.out.println("balance is "+total);
                }
                else
                {
                    System.out.println("insuffiecient balance. available amount to withdraw is "+total);
                }
            }

        }
        else
        {
            System.out.println("incorrect pin. session terminated. Login again");
            LoginStatus=false;
        }
        return total;

    }

    public int AddBalance(int total)
    {
        System.out.println("enter amount to add");
        int amount=read.nextInt();
        read.nextLine();
        total+=amount;
        System.out.println("Balance is "+total);
        return total;
    }

    public static void main(String[]args)
    {
        System.out.println("Bank management\n create user\n\n\n");

        System.out.println("enter account number");
        String AccNo=read.nextLine();

        System.out.println("enter User Pin");
        String userpin=read.nextLine();

        user=BankingManagement.getDetails(AccNo, userpin);

        System.out.println("Login\n\n");

        System.out.println("enter account number");
        String accNo=read.nextLine();

        System.out.println("enter pin");
        String pin=read.nextLine();

        boolean LoginStatus=user.login(accNo, pin);
        int total=0;

        if (LoginStatus)
        while(LoginStatus)
        {
            System.out.println("Menu\nChoose either number against the operation or type in the option. Invalid option would log out automatically");
            System.out.println("1.Add\n2.Withdraw\n3.Logout");
            String choice=read.nextLine();
            choice=choice.toLowerCase();
            if(choice.equals("1")||choice.equals("add"))
            {
                total=user.AddBalance(total);
            }
            else if(choice.equals("2")||choice.equals("withdraw"))
            {
                total=user.withdraw(userpin, total, LoginStatus);
            }
            else
            {
                System.out.println("Logging out");
                System.out.println("logged out succesfully");
                LoginStatus=false;
            }
        }
        else
        {
            System.out.println("wrong details entered. session terminated\n");
        }


    }
}