import java.util.*;
class Factorial
{
public static void main(String K[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter the no.=");
int a=ob.nextInt();
int i,fact=1;
for(i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("fact="+fact);

}
}
