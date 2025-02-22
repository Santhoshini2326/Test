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


        voice.Custmr_Name = sc.nextLine();
        voice.Custmr_ID = sc.next();
        voice.Payment_detail = sc.next();

        ArrayList<CustomerDetails>customer_list = new ArrayList<>();
        ArrayList<ItemDetails>item_list = new ArrayList<>();
        ArrayList<InvoiceDetails>invoice_list = new ArrayList<>();
        
        System.out.println("Enter the options:");
        int option = sc.nextInt();
        switch ( option) {
            case 1: 
                System.out.println("Enter the Customer Details");
                CustomerDetails obj = new CustomerDetails(); 
                obj.create_customer(customer_list);
                if((obj.Custmr_ID).contains(customer_list) || (obj.Custmr_Name).contains(customer_list))
                {
                    System.out.println("The Customer already exist");
                    break;
                }
                else
                {
                customer_list.add(obj);
                }
                System.out.println("Customer details added succesfully");
                
            case 2:
                System.out.println("Enter the Item Details");
                ItemDetails item = new ItemDetails(); 
                item.Create_item(item_list);
            
            case 3:
                System.out.println(" Creating Invoice Details");
            
            case 4:
                System.out.println("Enter the Invoice Details");
        
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
    Scanner ss = new Scanner(System.in);
  //  ArrayList<CustomerDetails> list = new ArrayList<>();

    void create_customer( CustomerDetails customer_list)
    {
        Custmr_Name = ss.nextLine(); 
        Custmr_ID = ss.next();
         Phone_No = ss.nextInt();
        Date = ss.nextInt();
    }
   
}
class ItemDetails
{
   String Rice_type;
   int Rice_quantity;
   String Pulses_type;
   int Pulses_quantity;
   String Powder_Type;
   int Powder_quantity;
   String Fruit_type;
   int Fruit_quantity;

   Scanner s = new Scanner(System.in);

   void Create_item(ItemDetails item_list)
   {
    Rice_quantity= s.nextInt();
    Rice_type= s.next();
    Powder_Type=s.next();
    Powder_quantity= s.nextInt();
    Pulses_type= s.next();
    Pulses_quantity = s.nextInt();
    Fruit_type= s.next();
    Fruit_quantity= s.nextInt();
   }

}
class InvoiceDetails
{ 
     String Custmr_Name;
     String Custmr_ID;
     String Payment_detail;
}

