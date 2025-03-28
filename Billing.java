import java.util.*;
public class Billing{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<CustomerDetails> customers = new ArrayList<>();
        Integer idnum = 1;
        while(true)
        {
            System.out.println("Enter 1 for Customer Details"+ '\n' +"Enter 2 for Item Details"+'\n'+"Enter 3 for Invoice details"
            +'\n'+"Enter 4 for Display the Invoice");
            int number = sc.nextInt();
            switch (number) 
            {
                case 1:
                CustomerDetails newCustomer = getCustomerDetails(sc, idnum);
             
                if(newCustomer == null )
                {
                    System.out.println("Invalid Information");
                    System.out.println("------------------------------------------------");
                }
                else
                {
                    customers.add(newCustomer);
                    idnum++;
                    System.out.println("------------------------------------------------");
                }
                    break;
                
                case 2:
                    
                    break;

                case 3:
                    
                    break;
                    
                case 4:
                    break;
            
                default:
                    break;
            }
        }
    }
    public static CustomerDetails getCustomerDetails(Scanner sc,Integer idnum)
    {
            System.out.println("The ID number is :");
            System.out.println(idnum);
            System.out.println("Enter the name:");
            String custname= sc.next();
            System.out.println("Enter the phone");
            Integer phone = sc.nextInt();
            System.out.println("Enter the mailid");
            String email = sc.next();
            boolean isValidEmail;
            isValidEmail = getEmailCheck(email);

            if (!isValidEmail) 
            {
            return null;
            }
            CustomerDetails customerDetails = new CustomerDetails(custname,phone,email,idnum);
        return customerDetails;
     }
     public static boolean getEmailCheck(String email)
     {
        if(email.contains("@") && email.endsWith(".com"))
        {
            return true;
        }
        return false;
     }
    /* public static void  getItemDetails(Scanner sc)
     {
        while (true) 
        {
            System.out.println();    
        }
        return ;
     }*/
}
