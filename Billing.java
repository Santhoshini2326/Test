import java.util.*;
public class Bill{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<CustomerDetails> customers = new ArrayList<>();
        ArrayList<ItemDetails> items = new ArrayList<>();
        Integer idnum = 1;
        while(true)
        {
            System.out.println("Enter 1 for Customer Details"+ '\n' +"Enter 2 for Item Details"+'\n'+"Enter 3 for Invoice details"
            +'\n'+"Enter 4 for Display the Invoice"+'\n'+"Enter 5 for searching the cutomer");
            int number = sc.nextInt();
            switch (number) 
            {
                case 1:
             
                    getCustomerDetails(sc, idnum,customers);
                    idnum++;
                    System.out.println("------------------------------------------------");
                    break;
                
                case 2:
                    
               /* while (true) 
                {
                    if(getItemDetails(sc) != null)
                    {
                        getItemDetails(sc);
                    }
                    else
                    {
                        break;
                    }  
                }*/
                    

                case 3:
                    
                    break;
                    
                case 4:
                    break;
            
                case 5:
                for(CustomerDetails i :customers)
                {
                    System.out.println("List of customer details:"); 
                   // System.out.println("Customer Name: "+customers.getName() );  
                }
              
            }
        }
    }

    public static void getCustomerDetails(Scanner sc,Integer idnum,ArrayList<CustomerDetails> customers)
    {
            System.out.println("The ID number is :");
            System.out.println(idnum);
            System.out.println("Enter the name:");
            String custname= sc.next();
            System.out.println("Enter the phone");
            Integer phone = sc.nextInt();
            String email = getValidEmail(sc, customers);
    
            CustomerDetails customerDetails = new CustomerDetails(custname,phone,email,idnum);
            customers.add(customerDetails);
     }


     public static String getValidEmail(Scanner sc, ArrayList<CustomerDetails> customers) 
     {
        System.out.println("Enter your email: ");
        String email = sc.next();
        if (!checkValidateMail(email)) 
        {
            System.out.println("Invalid email format, Please enter a valid email.");
            return getValidEmail(sc, customers); 
        }

        if (!isUniqueEmail(customers, email)) 
        {
            System.out.println(" Email already exists! Enter a different email.");
            return getValidEmail(sc, customers); 
        }

        return email; 
    }

     public static boolean isUniqueEmail(ArrayList<CustomerDetails> customers, String email) 
     {
        for (CustomerDetails customer : customers) {
            if (customer.getEmail().equals(email)) { 
                System.out.println("Invalid Email. Enter a valid one:");
                return false; 
            }
        }
    
        return true; 
    }
    
     public static boolean checkValidateMail(String email)
     {

        if(email.contains("@") && email.endsWith(".com"))
        {
            return true;
        }
        return false;
     }

    /*  public static ItemDetails  getItemDetails(Scanner sc)
     {
           // System.out.println("Enter the item:");
            //1String item = sc.next();
            System.out.println("Enter the quantity:");  
            int quantity = sc.nextInt();
        
        ItemDetails itemDetails = new ItemDetails(item, quantity);
        return itemDetails ;
     }*/
}
