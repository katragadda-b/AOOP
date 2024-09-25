import java.util.*;
public class UserLogin
{
    private static UserLogin user;
    private String username;
    private String password;

    private UserLogin(String username,String password)
    {
        this.username=username;
        this.password=password;
    }

    public static UserLogin getUser(String username,String password)
    {
        if(user==null)
        {
            user=new UserLogin(username,password);
        }
        return user;
    }

    public void LoginStatus(String status)
    {
        System.out.println(status);
    }

    public boolean Login(String username,String password)
    {
        if(this.username.equals(username)&&this.password.equals(password))
        return true;

        return false;
    }

    public static void main(String[]args)
    {
        Scanner userInput= new Scanner(System.in);
        System.out.println("user creation");

        System.out.println("enter username");
        String username=userInput.nextLine();

        System.out.println("enter password");
        String password=userInput.nextLine();

        System.out.println("Login");
        System.out.println("enter username");
        String UserName=userInput.nextLine();

        System.out.println("enter password");
        String Password=userInput.nextLine();



        userInput.close();
        user=UserLogin.getUser(username,password);

        if(user.Login(UserName,Password))
        {
            user.LoginStatus("Login Successfull");
            
        }
        else
        {
            user.LoginStatus("Lohin failed");
        }


    }
}