import java.util.*;
class Bankdetail
{
    String Name,id,city;
    int salary;
    void input()
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("enter the Name");
        Name=ob.nextLine();
        System.out.print("enter the id");
        id=ob.nextLine();
        System.out.print("enter the city");
        city=ob.nextLine();
        System.out.print("enter the salary");
        salary=ob.nextInt();
    }
    void disp()
    {
        System.out.println("Name"+Name);
        System.out.println("id"+id);
        System.out.println("city"+city);
        System.out.println("salary"+salary);
    }
}
class T
{
    public static void main(String K[])
    {
        Bankdetail e1=new Bankdetail();
        Bankdetail e2=new Bankdetail();
        e1.input();
        e2.input();
        e1.disp();
        e2.disp();
    }
}