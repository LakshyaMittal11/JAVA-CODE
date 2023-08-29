import java.util.*;
class Leapyear
{
    public static void main(String K[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("enter the  number");
        int a=ob.nextInt();
        if ((a%4==0 && a%100!=0 )|| (a%400==0))
         System.out.println("leap year");
        else
          System.out.println("Not leap year");
    }
}
                                                                             Lakshya Mittal(40)