public class CustomerDetails
{
   String custname;
   Integer phone;
   String email;
   Integer idnum;
     CustomerDetails(String custname,Integer phone,String email,Integer idnum)
    {
        this.custname = custname;
        this.phone = phone;
        this.email = email;
        this.idnum = idnum;
    }
    public String getName()
    {
        return custname;
    }
    public Integer getPhone()
    {
        return phone;
    }
    public String getEmail()
    {
        return email;
    }
    
}
