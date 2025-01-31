//QUESTION
Design a Call taxi booking application -There are n number of taxi’s. For simplicity, assume 4. But it should work for any number of taxi’s. -The are 
6 points(A,B,C,D,E,F) -All the points are in a straight line, and each point is 15kms away from the adjacent points. -It takes 60 mins to travel from one point 
to another -Each taxi charges Rs.100 minimum for the first 5 kilometers and Rs.10 for the subsequent kilometers. -For simplicity, time can be entered as absolute
time. Eg: 9hrs, 15hrs etc. -All taxi’s are initially stationed at A. -When a customer books a Taxi, a free taxi at that point is allocated -If no free taxi is 
available at that point, a free taxi at the nearest point is allocated. -If two taxi’s are free at the same point, one with lower earning is allocated -
Note that the taxi only charges the customer from the pickup point to the drop point. Not the distance it travels from an adjacent point to pickup the customer. -
If no taxi is free at that time, booking is rejected 

//CODE
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
