/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class User
{
    private String Email;
    private String password;
    private String role;
    public User(String Email,String password,String role)
    {
        this.Email=Email;
        this.password=password;
        this.role=role;
    }
    public String getEmail(){
        return Email;
    }
    public String getpassword(){
        return password;
    }
    public String getrole()
    {
        return role;
    }
}
public class Main
{
    public static void register()
    {
        System.out.println("Enter Your Email");
        String Email=sc.nextLine();
        for(User user:Userlist)
        {
            if(user.getEmail().equals(Email))
            {
                System.out.println("User mail already exits.So click login option");
                return;
            }
        }
        System.out.println("Enter your password");
        String pass=sc.nextLine();
        System.out.println("Enter your role Admin or Customer");
        String role=sc.nextLine();
        Userlist.add(new User(Email,pass,role));
        System.out.println("Register sucessfully");
    }
    public static void login()
    {
        System.out.println("Enter your mail");
        String Email=sc.nextLine();
        System.out.println("Enter your password");
        String pass=sc.nextLine();
        for(User user:Userlist)
        {
            if(user.getEmail().equals(Email) && user.getpassword().equals(pass))
            {
                if(user.getrole().equals("Admin"))
                {
                    System.out.println("Login Sucessfully Admin"+Email);
                    adminMenu();
                    return;
                }
                else{
                    System.out.println("Login Sucessfully Customer"+Email);
                    customerMenu();
                    return;
                }
            }
        }
        System.out.println("Not data Found");
    }
    public static void adminMenu()
    {
        System.out.println("1.Add book");
        System.out.println("2.Update book");
        System.out.println("3.Delete book");
        System.out.println("4.View book");
        System.out.println("5.Fine Amount");
        System.out.println("6.Report");
        System.out.println("7.Exit");
        while(true)
        {
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    {
                        System.out.println("Add the book");
                        break;
                    }
                case 2:
                    {
                        System.out.println("Update the book");
                        break;
                    }
                case 3:
                    {
                        System.out.println("Delete the book");
                        break;
                    }
                case 4:
                    {
                        System.out.println("View the book");
                        break;
                    }
                case 5:
                    {
                        System.out.println("Fine Amount");
                        break;
                    }
                case 6:
                    {
                        System.out.println("Report Details");
                        break;
                    }
                case 7:
                    {
                        System.out.println("Exit");
                        break;
                    }
                default:{
                    System.out.println("Invalid option");
                }
            }
        }
    }
    public static void customerMenu()
    {
        System.out.println("1.Search book");
        System.out.println("2.Buy book");
        System.out.println("3.Return book");
        System.out.println("4.Fine Amount");
        System.out.println("6.Exit");
        while(true)
        {
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    {
                        System.out.println("Search book");
                        break;
                    }
                case 2:
                    {
                        System.out.println("Buy book");
                        break;
                    }
                case 3:
                    {
                        System.out.println("Return book");
                        break;
                    }
                case 4:
                    {
                        System.out.println("Pay Fine Amount");
                        break;
                    }
                case 5:
                    {
                        System.out.println("Fine Amount");
                        break;
                    }
                case 6:
                    {
                        System.out.println("Exit");
                        break;
                    }
                default:{
                    System.out.println("Invalid option");
                }
            }
        }
    }
    static List<User>Userlist=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	    while(true)
	    {
	       System.out.println("..Welcome..");
	       System.out.println("\n 1.Register \n 2.Login \n 3.Exit");
	       System.out.println("Enter your choice");
	       int opt=sc.nextInt();
	       sc.nextLine();
	       switch(opt)
	       {
	           case 1:
	               {
	                   register();
	                   break;
	               }
	           case 2:
	               {
	                   login();
	                   break;
	               }
	           case 3:
	               {
	                   System.out.println("Exit");
	               }
	           default:{
	               System.out.println("Invalid choice");
	           }    
	       }
	    }
	}
}
