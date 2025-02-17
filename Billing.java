import java.util.*;
public class Billing 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int sum=0;
      
        InvoiceDetails voice = new InvoiceDetails();
        QuantityDetails quan = new QuantityDetails();
        
        int quanity_of_rice= sc.nextInt();
        int  quanity_of_pulses = sc.nextInt();
        int  rate_of_things = sc.nextInt();
        int rate_of_powder = sc.nextInt();
       
        System.out.println("Enter the Customer Details: ");
        String Custmr_Name = sc.nextLine(); 
        String Custmr_ID = sc.next();
        int Phone_No = sc.nextInt();
        int Date = sc.nextInt();

      //  CustomerDetails obj = new CustomerDetails(Custmr_ID,Custmr_Name,Date,Phone_No);  

        System.out.println("Enter the Item Details: ");
        int Rice_type= sc.nextInt();
        int Bathroom_Things=sc.nextInt();
        int Powder_Type=sc.nextInt();
        int Pulses_type= sc.nextInt();

        voice.Custmr_Name = sc.nextLine();
        voice.Custmr_ID = sc.next();
        voice.Payment_detail = sc.next();

        quan.Rice_cost_kg = sc.nextInt();
        quan.Pulses_type_100g = sc.nextInt();
        quan.Bathroom_Things_All = sc.nextInt();
        quan.Powder_Type_All = sc.nextInt();

        System.out.println("Enter the options:");
        int option = sc.nextInt();
        switch ( option) {
            case 1:
                
                System.out.println("Customer Details");
                CustomerDetails obj = new CustomerDetails(Custmr_ID,Custmr_Name,Date,Phone_No); 
                
            case 2:
                System.out.println("Item Details");
                ItemDetails item = new ItemDetails(Rice_type,Powder_Type,Pulses_type,Bathroom_Things); 
        
            default:
                break;
        }

         
    }    
}
 class CustomerDetails
{
    String Custmr_Name;
    String Custmr_ID;
    int Phone_No;
    int  Date;

    ArrayList<CustomerDetails> list = new ArrayList<>();
    CustomerDetails(String Custname,String Custid,int Custnumber, int Custdate)
    {
        this.Custmr_ID = Custid;
        this.Custmr_Name = Custname;
        this.Phone_No = Custnumber;
        this.Date = Custdate;
        list.add(this);
    }
   
}
class ItemDetails
{
   int Rice_type;
   int Pulses_type;
   int Powder_Type;
   int Bathroom_Things;

   ArrayList<ItemDetails> item_list = new ArrayList<>();
   ItemDetails(int ricetype,int plusetype, int powdertype, int bathroomthings)
   {
    this.Rice_type = ricetype;
    this.Pulses_type = plusetype;
    this.Powder_Type = powdertype;
    this.Bathroom_Things = bathroomthings;

   }

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

