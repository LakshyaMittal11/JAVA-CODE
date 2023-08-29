import java.util.*;
class Divisible
{
    public static void main(String K[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("enter the  number");
        int i =ob.nextInt();
        if(i%5==0 && i%11==0)
        System.out.println("no. is divisible by 5and11");
        else
        System.out.println("no. is not divisible by 5and11");
    }
}