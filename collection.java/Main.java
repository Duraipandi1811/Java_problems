import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> list = new HashSet<>();
        while (true) {
            System.out.println("Enter Email address");
            String value = sc.nextLine(); 
            list.add(value); 
            System.out.println("Do you want to Continue?(yes/no)");
            String choice = sc.nextLine();
            if (choice.equals("no"))
            {
                break; 
            }
        }
        System.out.println("Enter the email addresses to be searched separated by comma");
        String searchEmails = sc.nextLine();
        
        List<String> emailList = Arrays.asList(searchEmails.split(","));
        if (list.containsAll(emailList ))
        {
            System.out.println("Email addresses are present");
        } else {
            System.out.println("Email addresses are not present");
        }

    }
}
