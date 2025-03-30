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
          //  CustomerDetails newCustomer = getCustomerDetails(sc, idnum);
            switch (number) 
            {
                case 1:
                CustomerDetails newCustomer = getCustomerDetails(sc, idnum,customers);
             
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
                    
                while (true) 
                {
                    if(getItemDetails(sc) != null)
                    {
                        getItemDetails(sc);
                    }
                    else
                    {
                        break;
                    }  
                }
                    

                case 3:
                    
                    break;
                    
                case 4:
                    break;
            
                case 5:
                System.out.println("Searching customer in a list");
                String customer = sc.next();
              /*   for(CustomerDetails i : customers)
                {
                    if(customers(i).equals(customer))
                    {
                        System.out.println("The customer is present:" + customer);
                    }
                    else
                    {
                        System.out.println("The customer is not there ");
                    }
                    break;
                }*/
            }
        }
    }




    public static CustomerDetails getCustomerDetails(Scanner sc,Integer idnum,ArrayList<CustomerDetails> customers)
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
            for(CustomerDetails customer : customers)
            {
            if((customer.getEmail()).equals(email))
            {
                System.out.println("Type the valid Mail");
                email = sc.next();
                isValidEmail = getEmailCheck(email);
            }
            }

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

}
