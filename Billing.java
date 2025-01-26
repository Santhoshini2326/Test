import java.util.*;
public class Billing 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        CustomerDetails obj = new CustomerDetails();  
        ItemDetails item = new ItemDetails(); 
        InvoiceDetails voice = new InvoiceDetails();
        QuantityDetails quan = new QuantityDetails();
        int quanity_of_rice= sc.nextInt();
        int  quanity_of_pulses = sc.nextInt();
        int  rate_of_things = sc.nextInt();
        int rate_of_powder = sc.nextInt();
        ArrayList<Object> list = new ArrayList<>();
        System.out.println("Enter the Customer Details: ");
        obj.Custmr_Name = sc.nextLine(); 
        obj.Custmr_ID = sc.next();
        obj.Phone_No = sc.nextInt();
        obj.Date = sc.nextInt();
        System.out.println("Enter the Item Details: ");
        item.Rice_type= sc.nextInt();
        item.Bathroom_Things=sc.nextInt();
        item.Powder_Type=sc.nextInt();
        item.Pulses_type= sc.nextInt();

        voice.Custmr_Name = sc.nextLine();
        voice.Custmr_ID = sc.next();
        voice.Payment_detail = sc.next();

        quan.Rice_cost_kg = sc.nextInt();
        quan.Pulses_type_100g = sc.nextInt();
        quan.Bathroom_Things_All = sc.nextInt();
        quan.Powder_Type_All = sc.nextInt();

        for(int i=0;i<list.size();i++)
        {
            list.add(obj.Custmr_ID);
            list.add(obj.Custmr_Name);
            list.add(item.Rice_type);
            list.add(item.Pulses_type);
            list.add(quan.Rice_cost_kg);
            list.add(quan.Pulses_type_100g);
        }
        // for caluculating the bill
        for(Object i: list)
           
        {
            
            if(i instanceof Integer)
            {
                System.out.println("list.get(i) +  * + quanity_of_rice");
            }
           
        }
         
    }    
}
 class CustomerDetails
{
    String Custmr_Name;
    String Custmr_ID;
    int Phone_No;
    int Date;
   
}
class ItemDetails
{
   int Rice_type;
   int Pulses_type;
   int Powder_Type;
   int Bathroom_Things;

}
class InvoiceDetails
{
     String Custmr_Name;
     String Custmr_ID;
     String Payment_detail;
}
class QuantityDetails
{
    int Rice_cost_kg;
    int Pulses_type_100g;
    int Powder_Type_All;
    int Bathroom_Things_All;
}

