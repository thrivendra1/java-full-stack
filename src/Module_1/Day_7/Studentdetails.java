package Module_1.Day_7;

public class Studentdetails
{
    private String id;
    private String name;
    private long phone_number;


    public Studentdetails(String id,String name,long phone_number)
    {
        this.id=id;
        this.name=name;
        this.phone_number=phone_number;

    }

    public void display()
    {
        System.out.println(id+" "+name+"  "+phone_number);
    }

    public static void main(String[] args)
    {
        String id="19bcs108";
        String name="thrivendra";
        long phone_number=9182280832l;
        Studentdetails s=new Studentdetails(id,name,phone_number);

        s.display();

    }
}
