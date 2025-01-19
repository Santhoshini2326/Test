import java.util.*;
public class Billing 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        CustomerDetails obj = new CustomerDetails();  
        ItemDetails item = new ItemDetails(); 
        System.out.println("Enter the Customer Details: ");
        obj.Custmr_Name = sc.nextLine(); 
        obj.Custmr_ID = sc.next();
        obj.Phone_No = sc.nextInt();
        obj.Date = sc.nextInt();
        
        
    }    
}
 class CustomerDetails
{
    String Custmr_Name;
    String Custmr_ID;
    int Phone_No;
    int Date;
   // int age = 18;
}
class ItemDetails
{
    public static void Rice()
    {
        System.out.println(100);
    }
    public static void Oil()
    {
        System.out.println(100);
    }
    public static void pulses()
    {
        System.out.println(100);
    }

}
