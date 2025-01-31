import java.util.*;
import javax.print.attribute.standard.Destination;
public class Taxi 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of taxi");
        int num_taxi = sc.nextInt();
        kilometer_cost cost = new kilometer_cost();
        int kilometer = 1, total = 1;

        CustomerDetails customer = new CustomerDetails();
        customer.Customer_ID= sc.next();
        customer.Pickup_point= sc.next();
        customer.Drop_point= sc.next();
        System.out.println("Enter the pickup time:");
        int pickup_time = sc.nextInt();

        ArrayList< String> list = new ArrayList<>();

        Destination_pl obj = new Destination_pl();
        obj.dest1= sc.next();
        obj.dest2= sc.next();
        obj.dest3= sc.next();
        obj.dest4= sc.next();
       
        for(int i=0;i<list.size();i++)
        {
            list.add(obj.dest1);
            list.add(obj.dest2);
            list.add(obj.dest3);
            list.add(obj.dest4);
        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)== customer.Drop_point){
                kilometer = i*15;
               total = cost.payment(kilometer);
                break;

            }
        }
        System.out.println("the cost for the destination:"+total );

    }    
}

class CustomerDetails
{
    String Customer_ID;
    String Pickup_point;
    String Drop_point;
}

class Destination_pl
{
    String dest1;
    String dest2;
    String dest3;
    String dest4;
}
class kilometer_cost
{
    public static int payment(int a)
    {
        int count=0;
        if(a<=5)
        {
            count = 100;
        }
       else if(a>5)
        {
            count = (a*10)+100;
        }
        return count;
    }
    
}


//dont know how to get the distance between them 
//then dont know to allot the taxi.
//for now